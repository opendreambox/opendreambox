SRC_URI[dm7080.md5sum] = "5f7f116f4d147987c3360733ef9bef0a"
SRC_URI[dm7080.sha256sum] = "eef88683196f1839d3815aa18828940c079a2e4fd6a66a3b06ce3716146a0185"

require enigma2-bin-4.2.inc

COMPATIBLE_MACHINE = "^(dm820|dm7080)$"

PRECOMPILED_ARCH = "${@d.getVar('PV', True).split('-')[1]}"
PRECOMPILED_VERSION = "${@d.getVar('PV', True).split('-')[0]}"
