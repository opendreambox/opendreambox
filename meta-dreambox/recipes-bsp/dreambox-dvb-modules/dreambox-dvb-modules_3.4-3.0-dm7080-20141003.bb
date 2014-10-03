require dreambox-dvb-modules.inc

SRC_URI[modules.md5sum] = "36976df5a45f41d579f0b0363b166e17"
SRC_URI[modules.sha256sum] = "857792c76789e1f35ca652dfdad78b5e2cb56c39bd3a00ee8abacf93eaf2e877"

COMPATIBLE_MACHINE = "^(dm7080)$"

RREPLACES_${PN}-stb-core = "${PN} (< 3.4-3.0-dm7080-20140906-r1)"
RBREAKS_${PN}-stb-core = "${PN} (< 3.4-3.0-dm7080-20140906-r1)"
