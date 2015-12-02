require dreambox-dvb-modules.inc

SRC_URI[dm7080.md5sum] = "6d7a94a9e9fce44caaaadb3971eb981e"
SRC_URI[dm7080.sha256sum] = "b5ebf1851d53473d005d34863fa8a8bf26a754301861f0e652edf1eab57b6304"

COMPATIBLE_MACHINE = "^(dm7080)$"

RREPLACES_${PN}-stb-core = "${PN} (< 3.4-3.0-dm7080-20140906-r1)"
RBREAKS_${PN}-stb-core = "${PN} (< 3.4-3.0-dm7080-20140906-r1)"
