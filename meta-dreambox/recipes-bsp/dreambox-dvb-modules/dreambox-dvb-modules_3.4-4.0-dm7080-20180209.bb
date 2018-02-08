require dreambox-dvb-modules.inc

SRC_URI[dm7080.md5sum] = "fc016647c2b3c260cc6ca75c591f1ff0"
SRC_URI[dm7080.sha256sum] = "478a8fbeb6adf8980b763f608917c4eb8b56c994f3d1e62c06f6d4513b6feb4e"

RREPLACES_${PN}-stb-core = "${PN} (< 3.4-3.0-dm7080-20140906-r1)"
RBREAKS_${PN}-stb-core = "${PN} (< 3.4-3.0-dm7080-20140906-r1)"
