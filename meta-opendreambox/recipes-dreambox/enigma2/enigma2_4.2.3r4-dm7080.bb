SRC_URI[dm7080.md5sum] = "648baf5cf1868c50c3272a00bc80cb3b"
SRC_URI[dm7080.sha256sum] = "976920dc43b00590041280e99384b4cec0ff2b84e848d7418daf1368cb9ca38f"

require enigma2-bin-4.2.inc

SRC_URI += " file://0001-add-hack-to-disable-PGS-VOB-subtitles.patch"

COMPATIBLE_MACHINE = "^(dm820|dm7080)$"

PRECOMPILED_ARCH = "${@d.getVar('PV', True).split('-')[1]}"
PRECOMPILED_VERSION = "${@d.getVar('PV', True).split('-')[0]}"
