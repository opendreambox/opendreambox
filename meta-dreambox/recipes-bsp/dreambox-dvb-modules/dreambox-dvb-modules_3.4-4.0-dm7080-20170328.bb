require dreambox-dvb-modules.inc

SRC_URI[dm7080.md5sum] = "4373b5c851485101ad4806fde05c2d54"
SRC_URI[dm7080.sha256sum] = "226fd7257aaf12493a61cee29eaa19d826407c0f7408ea8cf1256971aa715673"

RREPLACES_${PN}-stb-core = "${PN} (< 3.4-3.0-dm7080-20140906-r1)"
RBREAKS_${PN}-stb-core = "${PN} (< 3.4-3.0-dm7080-20140906-r1)"
