require dreambox-dvb-modules.inc

SRC_URI[dm7080.md5sum] = "c992544483ed3bf2e45db41daa91be0b"
SRC_URI[dm7080.sha256sum] = "77e34d7247ffce41007c94773f42509e50fdfd64587f89e7a9ddaff135e326e3"

COMPATIBLE_MACHINE = "^(dm7080)$"

RREPLACES_${PN}-stb-core = "${PN} (< 3.4-3.0-dm7080-20140906-r1)"
RBREAKS_${PN}-stb-core = "${PN} (< 3.4-3.0-dm7080-20140906-r1)"
