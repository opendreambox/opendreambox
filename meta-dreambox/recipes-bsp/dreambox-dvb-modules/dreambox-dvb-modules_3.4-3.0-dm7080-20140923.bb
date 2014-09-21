require dreambox-dvb-modules.inc

SRC_URI[modules.md5sum] = "88984eb5a3c1bbc5ca1476309bc1666c"
SRC_URI[modules.sha256sum] = "c68c363225e356f5cd25e9b0b5399d65f852b6da0320fcc510d919bc062440c9"

COMPATIBLE_MACHINE = "^(dm7080)$"

RREPLACES_${PN}-stb-core = "${PN} (< 3.4-3.0-dm7080-20140906-r1)"
RBREAKS_${PN}-stb-core = "${PN} (< 3.4-3.0-dm7080-20140906-r1)"
