require dreambox-dvb-modules.inc

SRC_URI[dm7080.md5sum] = "1c7474b2b76d331bc3dd13f1a0676cdd"
SRC_URI[dm7080.sha256sum] = "d7d598f90e76353b43740720eaadf8eafc6c4ca53c673165801e47e6222c54d9"

RREPLACES_${PN}-stb-core = "${PN} (< 3.4-3.0-dm7080-20140906-r1)"
RBREAKS_${PN}-stb-core = "${PN} (< 3.4-3.0-dm7080-20140906-r1)"
