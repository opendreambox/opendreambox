SRC_URI[dm7080.md5sum] = "bba4602d304cb7fb3c684b28736674e5"
SRC_URI[dm7080.sha256sum] = "d5bbabca32d2fadc43f51202668aa660e52b1a4121b26c8a89bfaaca05995c56"

require enigma2-bin-4.2.inc

COMPATIBLE_MACHINE = "^(dm7080)$"

PRECOMPILED_ARCH = "${@d.getVar('PV', True).split('-')[1]}"
PRECOMPILED_VERSION = "${@d.getVar('PV', True).split('-')[0]}"
