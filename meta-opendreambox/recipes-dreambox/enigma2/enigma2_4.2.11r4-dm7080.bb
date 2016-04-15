SRC_URI[dm7080.md5sum] = "232e34c194756fb920a09f470863e5f6"
SRC_URI[dm7080.sha256sum] = "e755101945bf1d3401557d0d97030e551625cd42f915d27e092409c17da075d5"

require enigma2-bin-4.2.inc

COMPATIBLE_MACHINE = "^(dm820|dm7080)$"

PRECOMPILED_ARCH = "${@d.getVar('PV', True).split('-')[1]}"
PRECOMPILED_VERSION = "${@d.getVar('PV', True).split('-')[0]}"
