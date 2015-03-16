require dreambox-dvb-modules.inc

SRC_URI[dm7080.md5sum] = "0587d7a4eb4e20c38e64140a80e6aada"
SRC_URI[dm7080.sha256sum] = "4fc4a97db19df2387b14519558071f696259021c661ef6d75ef49b4f58ebd5c3"

COMPATIBLE_MACHINE = "^(dm7080)$"

RREPLACES_${PN}-stb-core = "${PN} (< 3.4-3.0-dm7080-20140906-r1)"
RBREAKS_${PN}-stb-core = "${PN} (< 3.4-3.0-dm7080-20140906-r1)"
