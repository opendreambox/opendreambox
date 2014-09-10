require dreambox-dvb-modules.inc

PR = "r1"

SRC_URI[modules.md5sum] = "4ba439920060211ce05847b19b0bc5df"
SRC_URI[modules.sha256sum] = "10ffa06b8a0ec77549cf6833f03a84d997617deaa3dc35cbd2742ce489e9607c"

COMPATIBLE_MACHINE = "^(dm7080)$"

RREPLACES_${PN}-stb-core = "${PN} (< 3.4-3.0-dm7080-20140906-r1)"
RBREAKS_${PN}-stb-core = "${PN} (< 3.4-3.0-dm7080-20140906-r1)"
