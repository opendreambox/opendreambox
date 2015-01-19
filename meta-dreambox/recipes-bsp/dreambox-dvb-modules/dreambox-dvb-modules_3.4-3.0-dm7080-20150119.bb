require dreambox-dvb-modules.inc

SRC_URI[dm7080.md5sum] = "17bf6d59650008c460bb1baebf7503e0"
SRC_URI[dm7080.sha256sum] = "d1a7c8b5b832fb87a38fa8c860d166889a7185c9e6ef378c7162d672ae40c5bd"

COMPATIBLE_MACHINE = "^(dm7080)$"

RREPLACES_${PN}-stb-core = "${PN} (< 3.4-3.0-dm7080-20140906-r1)"
RBREAKS_${PN}-stb-core = "${PN} (< 3.4-3.0-dm7080-20140906-r1)"
