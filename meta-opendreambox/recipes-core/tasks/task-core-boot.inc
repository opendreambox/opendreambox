#
# Copyright (C) 2007 OpenedHand Ltd.
#
SUMMARY = "opendreambox: minimal bootable image"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/LICENSE;md5=3f40d7994397109285ec7b81fdeb3b58 \
                    file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
INC_PR = "r9"

inherit task

PACKAGE_ARCH = "${MACHINE_ARCH}"

RDEPENDS_${PN} += " \
        base-files \
        base-passwd \
        busybox \
        ${@base_contains('MACHINE_FEATURES', 'keyboard', 'keymaps', '', d)} \
        netbase \
        update-alternatives-cworth \
        ${MACHINE_ESSENTIAL_EXTRA_RDEPENDS}"

RRECOMMENDS_${PN} += "${MACHINE_ESSENTIAL_EXTRA_RRECOMMENDS}"

#
# Set by the machine configuration with packages essential for device bootup
#
MACHINE_ESSENTIAL_EXTRA_RDEPENDS ?= ""
MACHINE_ESSENTIAL_EXTRA_RRECOMMENDS ?= ""
