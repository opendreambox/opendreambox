DESCRIPTION = "OpenDreambox: Essential packages"
SECTION = "opendreambox/base"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${OPENDREAMBOX_BASE}/LICENSE;md5=0a5ec7423edaca24547634f416478834"
DEPENDS = "virtual/kernel"
RDEPENDS_${PN} = " \
        ${@base_version_less_or_equal('DREAMBOX_KERNEL_VERSION', '2.6.18', '${ESSENTIAL_RDEPENDS_LEGACY}', '${ESSENTIAL_RDEPENDS}', d)} \
"
RRECOMMENDS_${PN} = " \
        ${@base_version_less_or_equal('DREAMBOX_KERNEL_VERSION', '2.6.18', '${ESSENTIAL_RRECOMMENDS_LEGACY}', '${ESSENTIAL_RRECOMMENDS}', d)} \
"
PR = "r3"

inherit task

PACKAGE_ARCH = "${MACHINE_ARCH}"

ESSENTIAL_RDEPENDS = " \
        kernel-module-snd-page-alloc \
        kernel-module-snd-pcm \
        kernel-module-snd-timer \
        kernel-module-stv0299 \
"
ESSENTIAL_RDEPENDS_LEGACY = " \
        v4l-dvb-module-dvb-core \
        v4l-dvb-module-stv0299 \
"
ESSENTIAL_RDEPENDS_LEGACY_append_dm8000 = " \
        kernel-module-fb \
        kernel-module-snd \
        kernel-module-snd-pcm \
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
ESSENTIAL_RRECOMMENDS_LEGACY = " \
        kernel-module-cifs \
        kernel-module-ext2 \
        kernel-module-nls-cp850 \
        kernel-module-nls-iso8859-15 \
        kernel-module-nls-utf8 \
        kernel-module-reiserfs \
"
