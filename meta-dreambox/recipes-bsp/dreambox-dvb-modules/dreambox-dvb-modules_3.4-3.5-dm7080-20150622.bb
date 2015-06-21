require dreambox-dvb-modules.inc

SRC_URI[dm7080.md5sum] = "813fb6f1364068280c41387788e40570"
SRC_URI[dm7080.sha256sum] = "d0f6ee844a4b4a8efa6c2e63f7e47d66fc09ad02dd0b690b5454f9b0c651e083"

COMPATIBLE_MACHINE = "^(dm7080)$"

RREPLACES_${PN}-stb-core = "${PN} (< 3.4-3.0-dm7080-20140906-r1)"
RBREAKS_${PN}-stb-core = "${PN} (< 3.4-3.0-dm7080-20140906-r1)"
