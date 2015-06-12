require dreambox-dvb-modules.inc

SRC_URI[dm7080.md5sum] = "84e98510d85f63b4056f826d30756204"
SRC_URI[dm7080.sha256sum] = "8f873a74e01aaff9ea30351a1465a87f48f2cc20460a6aa549dfcebabc557fac"

COMPATIBLE_MACHINE = "^(dm7080)$"

RREPLACES_${PN}-stb-core = "${PN} (< 3.4-3.0-dm7080-20140906-r1)"
RBREAKS_${PN}-stb-core = "${PN} (< 3.4-3.0-dm7080-20140906-r1)"
