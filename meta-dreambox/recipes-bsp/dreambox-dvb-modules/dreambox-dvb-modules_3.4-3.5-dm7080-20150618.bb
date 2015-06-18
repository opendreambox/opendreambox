require dreambox-dvb-modules.inc

SRC_URI[dm7080.md5sum] = "cc30d5f2ca463088bacdc2d3af4d2f18"
SRC_URI[dm7080.sha256sum] = "a7f07a710ec844c72b329855e5e0d7f668bc9ba77b37f98186d82c47ff35bb98"

COMPATIBLE_MACHINE = "^(dm7080)$"

RREPLACES_${PN}-stb-core = "${PN} (< 3.4-3.0-dm7080-20140906-r1)"
RBREAKS_${PN}-stb-core = "${PN} (< 3.4-3.0-dm7080-20140906-r1)"
