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
RDEPENDS_kernel-base = ""
PACKAGES_remove = "kernel-image"

python __anonymous() {
    type = d.getVar('KERNEL_IMAGETYPE', True) or ""
    alttype = d.getVar('KERNEL_ALT_IMAGETYPE', True) or ""
    types = d.getVar('KERNEL_IMAGETYPES', True) or ""
    types = ('%s %s %s' % (type, types, alttype)).split()

    for imagetype in set(types):
        d.setVar('PKG_kernel-image-%s' % imagetype.lower(), 'kernel-image-%s' % imagetype.lower())
        d.setVar('RPROVIDES_kernel-image-%s' % imagetype.lower(), 'kernel-image-%s-${KERNEL_VERSION_PKG_NAME}' % imagetype.lower())

    imagetype = types[0]
    d.setVar('RDEPENDS_kernel-image', 'kernel-image-%s' % imagetype.lower())

    postinst = d.getVar('pkg_postinst_kernel-image-%s' % imagetype.lower(), True)
    if not postinst:
        postinst = '#!/bin/sh\n'
    postinst += '[ -n "$D" ] || flash-kernel /${KERNEL_IMAGEDEST}/%s-${KERNEL_VERSION_NAME}\n' % imagetype
    d.setVar('pkg_postinst_kernel-image-%s' % imagetype.lower(), postinst)

    d.setVar('PKG_kernel-image-%s' % imagetype.lower(), 'kernel-image')
    d.appendVar('RPROVIDES_kernel-image-%s' % imagetype.lower(), ' kernel-image-${KERNEL_VERSION_PKG_NAME}')
    d.appendVar('RDEPENDS_kernel-image-%s' % imagetype.lower(), ' flash-scripts')
    d.setVar('RDEPENDS_kernel-base', 'kernel-image-%s' % imagetype.lower())
}

INITRAMFS_IMAGE = "dreambox-rescue-image"
INITRAMFS_IMAGE_BUNDLE = "1"
INITRAMFS_BASE_NAME = "rescue-${PV}-${PR}-${MACHINE}-${DATETIME}"
