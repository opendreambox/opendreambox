SRC_URI[dm7080.md5sum] = "81698c7fd053fc1b14c332533c389624"
SRC_URI[dm7080.sha256sum] = "9bae01a7d0496b87790be3416ac6bf5f98d515c6d4efb9b8f53127236ab46be4"

require enigma2-bin-4.2.inc

COMPATIBLE_MACHINE = "^(dm7080)$"

PRECOMPILED_ARCH = "${@d.getVar('PV', True).split('-')[1]}"
PRECOMPILED_VERSION = "${@d.getVar('PV', True).split('-')[0]}"
