require dreambox-dvb-modules.inc

SRC_URI[dm7080.md5sum] = "effe18f02cb2aa6789c646fffbbb6316"
SRC_URI[dm7080.sha256sum] = "5cc5f7ad18c5936c7d7af80f427d50c15422111a0c59d948bd713d51f05728ab"

RREPLACES_${PN}-stb-core = "${PN} (< 3.4-3.0-dm7080-20140906-r1)"
RBREAKS_${PN}-stb-core = "${PN} (< 3.4-3.0-dm7080-20140906-r1)"
