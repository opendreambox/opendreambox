SRC_URI = "file://enigma2-service-restart.patch"
SRC_URI[dm7080.md5sum] = "99310a8457c414e875890f155ebfa9d9"
SRC_URI[dm7080.sha256sum] = "5f9ef2bf71155951340dbc00b174fa3af20e1b347568c629745eb837e68d00c4"

require enigma2-bin-4.2.inc

COMPATIBLE_MACHINE = "^(dm7080)$"

PRECOMPILED_ARCH = "${@d.getVar('PV', True).split('-')[1]}"
PRECOMPILED_VERSION = "${@d.getVar('PV', True).split('-')[0]}"
