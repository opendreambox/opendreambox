SRC_URI[dm7080.md5sum] = "e9b12536263a78b632bbda5ba99d0113"
SRC_URI[dm7080.sha256sum] = "6fb346ff2ee5d8025556f290e9562541b695a07c99beae97b62ead23dc0637c7"

require enigma2-bin-4.2.inc

COMPATIBLE_MACHINE = "^(dm820|dm7080)$"

PRECOMPILED_ARCH = "${@d.getVar('PV', True).split('-')[1]}"
PRECOMPILED_VERSION = "${@d.getVar('PV', True).split('-')[0]}"
