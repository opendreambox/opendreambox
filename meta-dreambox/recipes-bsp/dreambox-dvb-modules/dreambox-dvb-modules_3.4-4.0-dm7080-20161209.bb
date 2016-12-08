require dreambox-dvb-modules.inc

SRC_URI[dm7080.md5sum] = "2535e03a26ec19258d6d410682a0a03a"
SRC_URI[dm7080.sha256sum] = "cc7baf8109f9687988f5759f84cdfb9dea56fe8694bb9a7a0229e3595f2efd1a"

RREPLACES_${PN}-stb-core = "${PN} (< 3.4-3.0-dm7080-20140906-r1)"
RBREAKS_${PN}-stb-core = "${PN} (< 3.4-3.0-dm7080-20140906-r1)"
