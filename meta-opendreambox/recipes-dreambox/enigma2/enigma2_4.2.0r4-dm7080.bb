SRC_URI[dm7080.md5sum] = "af1b46b6681f65a4ccc85de16b63fd78"
SRC_URI[dm7080.sha256sum] = "cef9d08d26e26933933422a71c97184005cfaf9acbc9b4b0658253a6fec4fa1e"

require enigma2-bin-4.2.inc

COMPATIBLE_MACHINE = "^(dm7080)$"

PRECOMPILED_ARCH = "${@d.getVar('PV', True).split('-')[1]}"
PRECOMPILED_VERSION = "${@d.getVar('PV', True).split('-')[0]}"
