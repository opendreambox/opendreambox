require dreambox-dvb-modules.inc

SRC_URI[dm7080.md5sum] = "593c200e202d55560cc50826980a2e2c"
SRC_URI[dm7080.sha256sum] = "dfe31a632ee9b8882b8943e98b5e1875a6ea79bc8840dde08bbd05bbfcc26881"

COMPATIBLE_MACHINE = "^(dm7080)$"

RREPLACES_${PN}-stb-core = "${PN} (< 3.4-3.0-dm7080-20140906-r1)"
RBREAKS_${PN}-stb-core = "${PN} (< 3.4-3.0-dm7080-20140906-r1)"
