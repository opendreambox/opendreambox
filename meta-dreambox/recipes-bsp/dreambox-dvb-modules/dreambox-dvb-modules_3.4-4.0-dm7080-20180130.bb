require dreambox-dvb-modules.inc

SRC_URI[dm7080.md5sum] = "5098a31612808a353995f59abc11d3a7"
SRC_URI[dm7080.sha256sum] = "9e77c6e7f4361b870bf779da2d9873d8710a98e0853361cc870310bc25bb130c"

RREPLACES_${PN}-stb-core = "${PN} (< 3.4-3.0-dm7080-20140906-r1)"
RBREAKS_${PN}-stb-core = "${PN} (< 3.4-3.0-dm7080-20140906-r1)"
