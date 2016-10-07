require libnexus-ui.inc

RDEPENDS_${PN} = "bcmdriver"

SRC_URI[dm900.md5sum] = "7d623b7f5f5de17c6aa879f4c9083107"
SRC_URI[dm900.sha256sum] = "b6ebaf821eefa26f4630d7831d2fd946380ee8d0a550c9c4508873ac6c09f5b8"

inherit opendreambox-precompiled-binary

COMPATIBLE_MACHINE = "^(dm900)$"
