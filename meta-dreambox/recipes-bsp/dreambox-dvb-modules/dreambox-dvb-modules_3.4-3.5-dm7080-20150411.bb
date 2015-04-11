require dreambox-dvb-modules.inc

SRC_URI[dm7080.md5sum] = "b4f5268d03abe7564128dae92f92a207"
SRC_URI[dm7080.sha256sum] = "affc941cad8f00723106a777cabfa248f993111245fd08a5b2a5a94e7bf89c46"

COMPATIBLE_MACHINE = "^(dm7080)$"

RREPLACES_${PN}-stb-core = "${PN} (< 3.4-3.0-dm7080-20140906-r1)"
RBREAKS_${PN}-stb-core = "${PN} (< 3.4-3.0-dm7080-20140906-r1)"
