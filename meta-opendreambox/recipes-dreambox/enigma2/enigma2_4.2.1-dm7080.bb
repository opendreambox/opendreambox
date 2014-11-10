SRC_URI[dm7080.md5sum] = "80a06196cc3ec3bcde90bc62656fa959"
SRC_URI[dm7080.sha256sum] = "499f33880de7b1bc5ce66054913213f431a95077325449e74847d433f0356a52"

require enigma2-bin-4.2.inc

COMPATIBLE_MACHINE = "^(dm7080)$"

PRECOMPILED_ARCH = "${@d.getVar('PV', True).split('-')[1]}"
PRECOMPILED_VERSION = "${@d.getVar('PV', True).split('-')[0]}"
