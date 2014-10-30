SRC_URI[dm7080.md5sum] = "1195ecd5d8db39b428c49e548fde6bb2"
SRC_URI[dm7080.sha256sum] = "f2ec223103bf8809e7986b1d464dcbab16d099ff253a674812ef02953395a85e"

require enigma2-bin-4.2.inc

COMPATIBLE_MACHINE = "^(dm7080)$"

PRECOMPILED_ARCH = "${@d.getVar('PV', True).split('-')[1]}"
PRECOMPILED_VERSION = "${@d.getVar('PV', True).split('-')[0]}"
