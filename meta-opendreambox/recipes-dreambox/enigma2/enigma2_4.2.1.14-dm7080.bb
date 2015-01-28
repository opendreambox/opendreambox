SRC_URI[dm7080.md5sum] = "fb2b162bacc5224e03abd08518950149"
SRC_URI[dm7080.sha256sum] = "6b78b8d60d083430c16a9c77f40febcafb7c034123573b25d91abd37a4fb214b"

require enigma2-bin-4.2.inc

COMPATIBLE_MACHINE = "^(dm820|dm7080)$"

PRECOMPILED_ARCH = "${@d.getVar('PV', True).split('-')[1]}"
PRECOMPILED_VERSION = "${@d.getVar('PV', True).split('-')[0]}"
