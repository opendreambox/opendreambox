require dreambox-dvb-modules.inc

SRC_URI[dm7080.md5sum] = "65ed9535b7fb17602119919afd9bcbd3"
SRC_URI[dm7080.sha256sum] = "33a9b8dad0a1a40c5fc8879c9581ae74289a7a81cd1d274d39f1fea7a8067417"

RREPLACES_${PN}-stb-core = "${PN} (< 3.4-3.0-dm7080-20140906-r1)"
RBREAKS_${PN}-stb-core = "${PN} (< 3.4-3.0-dm7080-20140906-r1)"
