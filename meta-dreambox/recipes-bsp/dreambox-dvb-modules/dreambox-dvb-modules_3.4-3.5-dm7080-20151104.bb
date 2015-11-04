require dreambox-dvb-modules.inc

SRC_URI[dm7080.md5sum] = "e197affedaf57365c1ef80f72fef3a9c"
SRC_URI[dm7080.sha256sum] = "2f322506000f27688b32ffc34b0328ac7d8e40340946629c9836d89e5e93e80b"

COMPATIBLE_MACHINE = "^(dm7080)$"

RREPLACES_${PN}-stb-core = "${PN} (< 3.4-3.0-dm7080-20140906-r1)"
RBREAKS_${PN}-stb-core = "${PN} (< 3.4-3.0-dm7080-20140906-r1)"
