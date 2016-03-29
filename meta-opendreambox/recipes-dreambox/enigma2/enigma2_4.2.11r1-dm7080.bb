SRC_URI[dm7080.md5sum] = "17e4f73f6554cf2a24ce7c5aab6b9ce5"
SRC_URI[dm7080.sha256sum] = "206b312cf18c4dc51dbbf46c0b5cb4c21f5a825710e04b59edc3c5bfa2518d75"

require enigma2-bin-4.2.inc

COMPATIBLE_MACHINE = "^(dm820|dm7080)$"

PRECOMPILED_ARCH = "${@d.getVar('PV', True).split('-')[1]}"
PRECOMPILED_VERSION = "${@d.getVar('PV', True).split('-')[0]}"
