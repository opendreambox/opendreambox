require dreambox-dvb-modules.inc

SRC_URI[dm7080.md5sum] = "c835a8d4b56a8b02f5af7cfc68feeace"
SRC_URI[dm7080.sha256sum] = "e92064129a6b7c16c011b43f15eb4c02e42d14ba84eb5cc81849cb88750b52be"

RREPLACES_${PN}-stb-core = "${PN} (< 3.4-3.0-dm7080-20140906-r1)"
RBREAKS_${PN}-stb-core = "${PN} (< 3.4-3.0-dm7080-20140906-r1)"
