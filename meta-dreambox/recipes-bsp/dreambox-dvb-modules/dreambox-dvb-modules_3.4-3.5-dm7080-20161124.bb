require dreambox-dvb-modules.inc

SRC_URI[dm7080.md5sum] = "036a2e9589797cfedc1f016dff67cd00"
SRC_URI[dm7080.sha256sum] = "634131560086a001efe70ed71afa9ee208f829ba378bbb62c0a1aa0d750b4dd2"

COMPATIBLE_MACHINE = "^(dm7080)$"

RREPLACES_${PN}-stb-core = "${PN} (< 3.4-3.0-dm7080-20140906-r1)"
RBREAKS_${PN}-stb-core = "${PN} (< 3.4-3.0-dm7080-20140906-r1)"
