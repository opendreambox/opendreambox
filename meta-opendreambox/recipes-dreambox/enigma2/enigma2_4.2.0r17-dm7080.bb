SRC_URI[dm7080.md5sum] = "1a270e47ff88da54880e18e5d933cd87"
SRC_URI[dm7080.sha256sum] = "20fa19bf726671156d0bb248115b81c08647c1ff1a5ec15d57d1c64985770e0e"

require enigma2-bin-4.2.inc

COMPATIBLE_MACHINE = "^(dm7080)$"

PRECOMPILED_ARCH = "${@d.getVar('PV', True).split('-')[1]}"
PRECOMPILED_VERSION = "${@d.getVar('PV', True).split('-')[0]}"
