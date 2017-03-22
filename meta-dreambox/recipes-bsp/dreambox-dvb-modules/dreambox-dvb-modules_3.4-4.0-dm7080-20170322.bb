require dreambox-dvb-modules.inc

SRC_URI[dm7080.md5sum] = "70a60b7e9ef8bd2c9ebedf5426ade7b7"
SRC_URI[dm7080.sha256sum] = "fb6bea26001842f67f90f6da0c065f50fe612f8decf7d61ba8ab4c474fb69c76"

RREPLACES_${PN}-stb-core = "${PN} (< 3.4-3.0-dm7080-20140906-r1)"
RBREAKS_${PN}-stb-core = "${PN} (< 3.4-3.0-dm7080-20140906-r1)"
