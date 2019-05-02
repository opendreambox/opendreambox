require dreambox-dvb-modules.inc

SRC_URI[dm7080.md5sum] = "a8fa0c83c143c7b38f6e46b6d7b9c444"
SRC_URI[dm7080.sha256sum] = "382ecc3a42006bd042ccedc89a0c1d8aeb01da759187054d93158d56054a6a7d"

RREPLACES_${PN}-stb-core = "${PN} (< 3.4-3.0-dm7080-20140906-r1)"
RBREAKS_${PN}-stb-core = "${PN} (< 3.4-3.0-dm7080-20140906-r1)"
