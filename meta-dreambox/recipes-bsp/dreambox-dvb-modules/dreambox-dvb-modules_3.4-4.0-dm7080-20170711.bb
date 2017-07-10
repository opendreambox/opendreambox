require dreambox-dvb-modules.inc

SRC_URI[dm7080.md5sum] = "aded134e173b72298ae4069d73e58a3b"
SRC_URI[dm7080.sha256sum] = "6853d84a0da4ce6d6677a8efd1eddd7a1b18216a040b09e1aae102082422d182"

RREPLACES_${PN}-stb-core = "${PN} (< 3.4-3.0-dm7080-20140906-r1)"
RBREAKS_${PN}-stb-core = "${PN} (< 3.4-3.0-dm7080-20140906-r1)"
