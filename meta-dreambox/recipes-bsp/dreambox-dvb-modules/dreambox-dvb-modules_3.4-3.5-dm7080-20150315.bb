require dreambox-dvb-modules.inc

SRC_URI[dm7080.md5sum] = "3658e6629cd94b6baa923b7a8dcc784b"
SRC_URI[dm7080.sha256sum] = "f39e145468c365a92f6c1c6b4fe632a8f9be308ab049126828b8e8b76e9d5e34"

COMPATIBLE_MACHINE = "^(dm7080)$"

RREPLACES_${PN}-stb-core = "${PN} (< 3.4-3.0-dm7080-20140906-r1)"
RBREAKS_${PN}-stb-core = "${PN} (< 3.4-3.0-dm7080-20140906-r1)"
