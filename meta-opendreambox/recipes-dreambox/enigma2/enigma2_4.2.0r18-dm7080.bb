SRC_URI[dm7080.md5sum] = "7dfc3afe8607bc0045cf3be183ce038c"
SRC_URI[dm7080.sha256sum] = "1b493d2ac19cee1ca3014c399dd8b58a55b895d323595bbd68f1641ae5a58bc1"

require enigma2-bin-4.2.inc

COMPATIBLE_MACHINE = "^(dm7080)$"

PRECOMPILED_ARCH = "${@d.getVar('PV', True).split('-')[1]}"
PRECOMPILED_VERSION = "${@d.getVar('PV', True).split('-')[0]}"
