SUMMARY = "OpenDreambox: Essential packages"
SECTION = "opendreambox/base"
LICENSE = "MIT"

PACKAGE_ARCH = "${MACHINE_ARCH}"

inherit packagegroup

RRECOMMENDS_${PN} = " \
        kernel-module-autofs4 \
        kernel-module-cdrom \
        kernel-module-cifs \
        kernel-module-nls-cp850 \
        kernel-module-nls-iso8859-1 \
        kernel-module-nls-iso8859-15 \
        kernel-module-ntfs \
        kernel-module-reiserfs \
        kernel-module-snd-page-alloc \
        kernel-module-snd-pcm \
        kernel-module-snd-timer \
        kernel-module-sr-mod \
        kernel-module-stv0299 \
        kernel-module-usbhid \
"
