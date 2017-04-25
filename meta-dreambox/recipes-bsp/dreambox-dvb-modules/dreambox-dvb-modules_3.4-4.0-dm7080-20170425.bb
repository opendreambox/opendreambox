require dreambox-dvb-modules.inc

SRC_URI[dm7080.md5sum] = "4f8367eee8c50e1a164301728a748898"
SRC_URI[dm7080.sha256sum] = "4f4fa5052d6216b1471b673981b62be81af7a3d9b9b111a3f0900f547bf1090b"

RREPLACES_${PN}-stb-core = "${PN} (< 3.4-3.0-dm7080-20140906-r1)"
RBREAKS_${PN}-stb-core = "${PN} (< 3.4-3.0-dm7080-20140906-r1)"
