require dreambox-dvb-modules.inc

SRC_URI[dm7080.md5sum] = "d6989c9f0d46df7a7b19ace65c1c7f88"
SRC_URI[dm7080.sha256sum] = "b919781a40c18e4df0a6c11f67e8d5c05ec679a401eb3626df23d5ea43342b06"

RREPLACES_${PN}-stb-core = "${PN} (< 3.4-3.0-dm7080-20140906-r1)"
RBREAKS_${PN}-stb-core = "${PN} (< 3.4-3.0-dm7080-20140906-r1)"
