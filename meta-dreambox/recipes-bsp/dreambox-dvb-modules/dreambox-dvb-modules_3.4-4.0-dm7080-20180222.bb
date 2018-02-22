require dreambox-dvb-modules.inc

SRC_URI[dm7080.md5sum] = "1858f867b5ae51aba6ad9496dca2c259"
SRC_URI[dm7080.sha256sum] = "7b874ca71d46cc5cf7d65edf669a15d75766ab1d475df1f4f94fbf6a9de685b8"

RREPLACES_${PN}-stb-core = "${PN} (< 3.4-3.0-dm7080-20140906-r1)"
RBREAKS_${PN}-stb-core = "${PN} (< 3.4-3.0-dm7080-20140906-r1)"
