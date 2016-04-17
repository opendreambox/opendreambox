SRC_URI[dm7080.md5sum] = "1162ab601742fd7a48d1ebac93495810"
SRC_URI[dm7080.sha256sum] = "574b9c6c9410c0b082c06dc1602adc22b1a3c59d9579ea9951ed1ee5b8c398d4"

require enigma2-bin-4.3.inc

COMPATIBLE_MACHINE = "^(dm820|dm7080)$"

PRECOMPILED_ARCH = "${@d.getVar('PV', True).split('-')[1]}"
PRECOMPILED_VERSION = "${@d.getVar('PV', True).split('-')[0]}"
