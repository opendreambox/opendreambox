SUMMARY = "OpenDreambox: Essential packages"
SECTION = "opendreambox/base"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${OPENDREAMBOX_BASE}/LICENSE;md5=23102313c1f42fea498404eb17e55202"
DEPENDS = "virtual/kernel"
RDEPENDS_${PN} = "${ESSENTIAL_RDEPENDS}"
RRECOMMENDS_${PN} = "${ESSENTIAL_RRECOMMENDS}"

inherit packagegroup

PACKAGE_ARCH = "${MACHINE_ARCH}"

ESSENTIAL_RDEPENDS = " \
        kernel-module-snd-page-alloc \
        kernel-module-snd-pcm \
        kernel-module-snd-timer \
        kernel-module-stv0299 \
"
ESSENTIAL_RRECOMMENDS = " \
        kernel-module-autofs4 \
        kernel-module-cdrom \
        kernel-module-cifs \
        kernel-module-nls-cp850 \
        kernel-module-nls-iso8859-1 \
        kernel-module-nls-iso8859-15 \
        kernel-module-ntfs \
        kernel-module-reiserfs \
        kernel-module-sr-mod \
        kernel-module-usbhid \
"
