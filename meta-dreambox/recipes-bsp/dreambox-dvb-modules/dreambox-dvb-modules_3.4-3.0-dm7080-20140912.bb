require dreambox-dvb-modules.inc

SRC_URI[modules.md5sum] = "eb67b714bee72f6de698c3c1f04adeb4"
SRC_URI[modules.sha256sum] = "1ae3363c53fd7fac2ccbbaad175962fa0346a313b3d4049af495745cce07419a"

COMPATIBLE_MACHINE = "^(dm7080)$"

RREPLACES_${PN}-stb-core = "${PN} (< 3.4-3.0-dm7080-20140906-r1)"
RBREAKS_${PN}-stb-core = "${PN} (< 3.4-3.0-dm7080-20140906-r1)"
