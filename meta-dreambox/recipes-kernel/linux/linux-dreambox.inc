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

KERNEL_FLASH_ARGS ?= ""

python __anonymous() {
    type = d.getVar('KERNEL_IMAGETYPE', True) or ""
    alttype = d.getVar('KERNEL_ALT_IMAGETYPE', True) or ""
    types = d.getVar('KERNEL_IMAGETYPES', True) or ""
    types = ('%s %s %s' % (type, types, alttype)).split()
    devicetree = d.getVar('KERNEL_DEVICETREE', False)

    for imagetype in set(types):
        d.setVar('PKG_kernel-image-%s' % imagetype.lower(), 'kernel-image-%s' % imagetype.lower())
        d.setVar('RPROVIDES_kernel-image-%s' % imagetype.lower(), 'kernel-image-%s-${KERNEL_VERSION_PKG_NAME}' % imagetype.lower())
        if devicetree:
            d.appendVar('RDEPENDS_kernel-image-%s' % imagetype.lower(), ' kernel-devicetree')

    imagetype = types[0]
    d.setVar('RDEPENDS_kernel-image', 'kernel-image-%s' % imagetype.lower())

    postinst = d.getVar('pkg_postinst_kernel-image-%s' % imagetype.lower(), False)
    if not postinst:
        postinst = '#!/bin/sh\n'
    postinst += '[ -n "$D" ] || flash-kernel ${KERNEL_FLASH_ARGS} /${KERNEL_IMAGEDEST}/%s-${KERNEL_VERSION_NAME}\n' % imagetype
    d.setVar('pkg_postinst_kernel-image-%s' % imagetype.lower(), postinst)

    d.setVar('PKG_kernel-image-%s' % imagetype.lower(), 'kernel-image')
    d.appendVar('RPROVIDES_kernel-image-%s' % imagetype.lower(), ' kernel-image-${KERNEL_VERSION_PKG_NAME}')
    d.appendVar('RDEPENDS_kernel-image-%s' % imagetype.lower(), ' flash-scripts')
    d.setVar('RDEPENDS_kernel-base', 'kernel-image-%s' % imagetype.lower())
}

PROVIDES_append_bcm73625 = " dreambox-rescue-image-${MACHINE}"
PROVIDES_append_bcm7435 = " dreambox-rescue-image-${MACHINE}"
PROVIDES_append_bcm7439 = " dreambox-rescue-image-${MACHINE}"
INITRAMFS_IMAGE_bcm73625 = "dreambox-rescue-image"
INITRAMFS_IMAGE_bcm7435 = "dreambox-rescue-image"
INITRAMFS_IMAGE_bcm7439 = "dreambox-rescue-image"
INITRAMFS_IMAGE_BUNDLE_bcm73625 = "1"
INITRAMFS_IMAGE_BUNDLE_bcm7435 = "1"
INITRAMFS_IMAGE_BUNDLE_bcm7439 = "1"
INITRAMFS_BASE_NAME = "rescue-${PV}-${PR}-${MACHINE}-${DATETIME}"

def kernel_console(d):
    console = ','.join(reversed(next(iter((d.getVar('SERIAL_CONSOLES') or '').split()), 'null').split(';')))
    return 'console=%s' % console
