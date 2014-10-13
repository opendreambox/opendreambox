require dreambox-dvb-modules.inc

SRC_URI[modules.md5sum] = "6886aac18f66c7ad07affba8068d94da"
SRC_URI[modules.sha256sum] = "2c04e3376c0c35a41ee1e3a62093fc35b635f3842e6aa3d9fe0b30c4947c1930"

COMPATIBLE_MACHINE = "^(dm7080)$"

RREPLACES_${PN}-stb-core = "${PN} (< 3.4-3.0-dm7080-20140906-r1)"
RBREAKS_${PN}-stb-core = "${PN} (< 3.4-3.0-dm7080-20140906-r1)"
