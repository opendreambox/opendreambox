require dreambox-dvb-modules.inc

SRC_URI[dm7080.md5sum] = "f1a930b20713323185964d09bc91ef61"
SRC_URI[dm7080.sha256sum] = "55879874b0e6beed9168179cc1d2a2b37b1d38036b86f3f83c0fdf7d447007ab"

COMPATIBLE_MACHINE = "^(dm7080)$"

RREPLACES_${PN}-stb-core = "${PN} (< 3.4-3.0-dm7080-20140906-r1)"
RBREAKS_${PN}-stb-core = "${PN} (< 3.4-3.0-dm7080-20140906-r1)"
