SRC_URI[dm7080.md5sum] = "aee473895d7692a9172fe616f86c8bd9"
SRC_URI[dm7080.sha256sum] = "4cc606ca7fbb810c87b7cdb88dd358aef9bdf3c1c203280060f0f1a930830a61"

require enigma2-bin-4.2.inc

COMPATIBLE_MACHINE = "^(dm7080)$"

PRECOMPILED_ARCH = "${@d.getVar('PV', True).split('-')[1]}"
PRECOMPILED_VERSION = "${@d.getVar('PV', True).split('-')[0]}"
