require dreambox-dvb-modules.inc

SRC_URI[dm7080.md5sum] = "baff901323bc291fd82255095fa63659"
SRC_URI[dm7080.sha256sum] = "78de6b265848b41aeccc89074e315c2e1749f04dbb1952d78a214d8c62ead0ce"

RREPLACES_${PN}-stb-core = "${PN} (< 3.4-3.0-dm7080-20140906-r1)"
RBREAKS_${PN}-stb-core = "${PN} (< 3.4-3.0-dm7080-20140906-r1)"
