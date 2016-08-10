SRC_URI[dm7080.md5sum] = "4d04ffacc78832c1c38295a03d4d78ed"
SRC_URI[dm7080.sha256sum] = "f668086d6f322519c97802b19f74d6be9be34031355ae799c6df73da2e6f528e"

require enigma2-bin-4.3.inc

COMPATIBLE_MACHINE = "^(dm520|dm820|dm7080)$"

PRECOMPILED_ARCH = "${@d.getVar('PV', True).split('-')[1]}"
PRECOMPILED_VERSION = "${@d.getVar('PV', True).split('-')[0]}"
