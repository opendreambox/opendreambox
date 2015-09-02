require dreambox-dvb-modules.inc

SRC_URI[dm7080.md5sum] = "0b62dc6ac629afae21ee48439f83064d"
SRC_URI[dm7080.sha256sum] = "9bfa8be1a86fc4daa6b98919f238f05517ec4704d300091dae88ce4853ce9ba8"

COMPATIBLE_MACHINE = "^(dm7080)$"

RREPLACES_${PN}-stb-core = "${PN} (< 3.4-3.0-dm7080-20140906-r1)"
RBREAKS_${PN}-stb-core = "${PN} (< 3.4-3.0-dm7080-20140906-r1)"
