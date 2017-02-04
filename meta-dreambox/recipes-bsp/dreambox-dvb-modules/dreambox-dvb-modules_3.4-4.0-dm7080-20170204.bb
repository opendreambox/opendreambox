require dreambox-dvb-modules.inc

SRC_URI[dm7080.md5sum] = "772af2c30dec559ad436debe870b7a17"
SRC_URI[dm7080.sha256sum] = "97a9ffa98604f518023776c6708e418b377a971359def7e5c7a9535d45200f25"

RREPLACES_${PN}-stb-core = "${PN} (< 3.4-3.0-dm7080-20140906-r1)"
RBREAKS_${PN}-stb-core = "${PN} (< 3.4-3.0-dm7080-20140906-r1)"
