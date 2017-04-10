require dreambox-dvb-modules.inc

SRC_URI[dm7080.md5sum] = "dadc9913a15d0d4c548af9fea4260276"
SRC_URI[dm7080.sha256sum] = "737bc511dc55b3dcf883ecf263277db568567fd8874a33a09649a85a03110a19"

RREPLACES_${PN}-stb-core = "${PN} (< 3.4-3.0-dm7080-20140906-r1)"
RBREAKS_${PN}-stb-core = "${PN} (< 3.4-3.0-dm7080-20140906-r1)"
