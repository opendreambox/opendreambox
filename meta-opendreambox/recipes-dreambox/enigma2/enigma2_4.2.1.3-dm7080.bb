SRC_URI[dm7080.md5sum] = "7a46a7fd96a2009e2975e5a3814b05c0"
SRC_URI[dm7080.sha256sum] = "cb18f5b644b8e1faacb86bfe35e849177830407bb8abd5d7d0e91030bbed99cc"

require enigma2-bin-4.2.inc

COMPATIBLE_MACHINE = "^(dm7080)$"

PRECOMPILED_ARCH = "${@d.getVar('PV', True).split('-')[1]}"
PRECOMPILED_VERSION = "${@d.getVar('PV', True).split('-')[0]}"
