require dreambox-dvb-modules.inc

SRC_URI[dm7080.md5sum] = "33828f1d7372aa99d9455684d5e699b5"
SRC_URI[dm7080.sha256sum] = "246963ab02a1a9c639c201c7649286675d139461a0927dbf947c01bed0ed66fd"

RREPLACES_${PN}-stb-core = "${PN} (< 3.4-3.0-dm7080-20140906-r1)"
RBREAKS_${PN}-stb-core = "${PN} (< 3.4-3.0-dm7080-20140906-r1)"
