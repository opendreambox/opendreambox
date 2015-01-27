require dreambox-dvb-modules.inc

SRC_URI[dm7080.md5sum] = "b2f38264806222ff33aaefc9c63d8888"
SRC_URI[dm7080.sha256sum] = "34c3e0cab71545925341704404cae3b2a9046b3be0251cae2b596dcf8e2a8c67"

COMPATIBLE_MACHINE = "^(dm7080)$"

RREPLACES_${PN}-stb-core = "${PN} (< 3.4-3.0-dm7080-20140906-r1)"
RBREAKS_${PN}-stb-core = "${PN} (< 3.4-3.0-dm7080-20140906-r1)"
