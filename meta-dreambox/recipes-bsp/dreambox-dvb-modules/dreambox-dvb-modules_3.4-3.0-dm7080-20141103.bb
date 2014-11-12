require dreambox-dvb-modules-legacy.inc

SRC_URI[modules.md5sum] = "ecb6143fd7979c689344ed49a54fc0fc"
SRC_URI[modules.sha256sum] = "dc2ec248e018df465c4f88e8cc33bc9b90263911699648fb800452d89e570414"

COMPATIBLE_MACHINE = "^(dm7080)$"

RREPLACES_${PN}-stb-core = "${PN} (< 3.4-3.0-dm7080-20140906-r1)"
RBREAKS_${PN}-stb-core = "${PN} (< 3.4-3.0-dm7080-20140906-r1)"
