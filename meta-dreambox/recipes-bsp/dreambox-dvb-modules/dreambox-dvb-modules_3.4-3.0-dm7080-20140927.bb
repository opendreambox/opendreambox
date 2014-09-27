require dreambox-dvb-modules.inc

SRC_URI[modules.md5sum] = "14d4f04872f0bcc3600ff9784070d081"
SRC_URI[modules.sha256sum] = "fd5d1bf456536d729d2d71a909fea164750941c11d1177128319dde36f5d7e05"

COMPATIBLE_MACHINE = "^(dm7080)$"

RREPLACES_${PN}-stb-core = "${PN} (< 3.4-3.0-dm7080-20140906-r1)"
RBREAKS_${PN}-stb-core = "${PN} (< 3.4-3.0-dm7080-20140906-r1)"
