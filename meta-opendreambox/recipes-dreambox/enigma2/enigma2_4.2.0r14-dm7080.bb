SRC_URI[dm7080.md5sum] = "c577ea8186c38e6c10c15c037fb2a51c"
SRC_URI[dm7080.sha256sum] = "21074acdf352d876008316c46f10bbd11b6ac6b37cf410b0fa811d85007c42d3"

require enigma2-bin-4.2.inc

COMPATIBLE_MACHINE = "^(dm7080)$"

PRECOMPILED_ARCH = "${@d.getVar('PV', True).split('-')[1]}"
PRECOMPILED_VERSION = "${@d.getVar('PV', True).split('-')[0]}"
