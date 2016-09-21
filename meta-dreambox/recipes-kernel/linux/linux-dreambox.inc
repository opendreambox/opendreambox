require linux.inc
require linux-rdepends.inc

do_configure_prepend() {
        sed -e "/^SUBLEVEL = /d" -i ${S}/Makefile
}

KERNEL_ENABLE_CGROUPS = "1"

# By default, kernel.bbclass modifies package names to allow multiple kernels
# to be installed in parallel. We revert this change and rprovide the versioned
# package names instead, to allow only one kernel to be installed.
PKG_kernel = "kernel"
RPROVIDES_kernel = "kernel-${KERNEL_VERSION_PKG_NAME}"
PKG_kernel-base = "kernel-base"
RPROVIDES_kernel-base = "kernel-base-${KERNEL_VERSION_PKG_NAME}"
PKG_kernel-image = "kernel-image"
RPROVIDES_kernel-image = "kernel-image-${KERNEL_VERSION_PKG_NAME}"

python __anonymous() {
    imagetypes = [x.lower() for x in (d.getVar('KERNEL_IMAGETYPES', True) or "").split()]
    for t in imagetypes:
        d.setVar('PKG_kernel-image-%s' % t, 'kernel-image-%s' % t)
        d.setVar('RPROVIDES_kernel-image-%s' % t, 'kernel-image-%s-${KERNEL_VERSION_PKG_NAME}' % t)

    imagetype = (d.getVar('KERNEL_IMAGETYPE', True) or imagetypes[0]).lower()
    d.setVar('RDEPENDS_kernel-image', 'kernel-image-%s' % imagetype)

    postinst = d.getVar('pkg_postinst_kernel-image-%s' % imagetype, True)
    if not postinst:
        postinst = '#!/bin/sh\n'
    postinst += '[ -n "$D" ] || flash-kernel /${KERNEL_IMAGEDEST}/%s-${KERNEL_VERSION_NAME}\n' % imagetype
    d.setVar('pkg_postinst_kernel-image-%s' % imagetype, postinst)

    d.appendVar('RDEPENDS_kernel-image-%s' % imagetype, ' flash-scripts')
}

INITRAMFS_IMAGE = "dreambox-rescue-image"
INITRAMFS_IMAGE_BUNDLE = "1"
INITRAMFS_BASE_NAME = "rescue-${PV}-${PR}-${MACHINE}-${DATETIME}"
