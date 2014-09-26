require dreambox-dvb-modules.inc

SRC_URI[modules.md5sum] = "03e92677ffcb222daa097d53b6c039e9"
SRC_URI[modules.sha256sum] = "445a800db546828ee50ab5a7bc9fd7759761e17f4b69e94088db4af34f679a74"

COMPATIBLE_MACHINE = "^(dm7080)$"

RREPLACES_${PN}-stb-core = "${PN} (< 3.4-3.0-dm7080-20140906-r1)"
RBREAKS_${PN}-stb-core = "${PN} (< 3.4-3.0-dm7080-20140906-r1)"
