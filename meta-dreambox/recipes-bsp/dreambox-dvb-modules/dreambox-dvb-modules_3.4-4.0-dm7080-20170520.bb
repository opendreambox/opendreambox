require dreambox-dvb-modules.inc

SRC_URI[dm7080.md5sum] = "056881fa29cd5f6a727647314269501e"
SRC_URI[dm7080.sha256sum] = "4b65a2efd4b53de445adfaacf69f5b08c64c013ebfb61d3a94a3b08cbe8731a1"

RREPLACES_${PN}-stb-core = "${PN} (< 3.4-3.0-dm7080-20140906-r1)"
RBREAKS_${PN}-stb-core = "${PN} (< 3.4-3.0-dm7080-20140906-r1)"
