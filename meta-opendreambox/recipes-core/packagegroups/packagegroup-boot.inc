#
# Copyright (C) 2007 OpenedHand Ltd.
#
SUMMARY = "opendreambox: minimal bootable image"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${OPENDREAMBOX_BASE}/LICENSE;md5=ed920ea8b6701825484d079e87a3a73a"

PACKAGE_ARCH = "${MACHINE_ARCH}"

inherit packagegroup

RDEPENDS_${PN} += " \
        base-files \
        base-passwd \
        busybox \
        ${@bb.utils.contains('MACHINE_FEATURES', 'keyboard', 'keymaps', '', d)} \
        netbase \
        udev \
        update-alternatives-dpkg \
        ${MACHINE_ESSENTIAL_EXTRA_RDEPENDS}"

RRECOMMENDS_${PN} += "${MACHINE_ESSENTIAL_EXTRA_RRECOMMENDS}"

RPROVIDES_${PN} += "packagegroup-boot"
RCONFLICTS_${PN} += "packagegroup-boot"
