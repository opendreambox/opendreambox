SRC_URI[dm7080.md5sum] = "655b56092c3ccbfcdbe2b2277bcb01b3"
SRC_URI[dm7080.sha256sum] = "e01b9390f7a7fb4e6fc3d037dcf4bc2e2b1f1332cc569dcda183dd1fa3860f06"

require enigma2-bin-4.2.inc

COMPATIBLE_MACHINE = "^(dm7080)$"

PRECOMPILED_ARCH = "${@d.getVar('PV', True).split('-')[1]}"
PRECOMPILED_VERSION = "${@d.getVar('PV', True).split('-')[0]}"
