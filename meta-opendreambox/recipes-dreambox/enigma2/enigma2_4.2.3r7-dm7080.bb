SRC_URI[dm7080.md5sum] = "730b4a8b3019788ee09d3082b7e75bef"
SRC_URI[dm7080.sha256sum] = "c03b3107c5660de9cb4559dd51230743e2140ed53067fe8828bdc500882c2972"

require enigma2-bin-4.2.inc

COMPATIBLE_MACHINE = "^(dm820|dm7080)$"

PRECOMPILED_ARCH = "${@d.getVar('PV', True).split('-')[1]}"
PRECOMPILED_VERSION = "${@d.getVar('PV', True).split('-')[0]}"
