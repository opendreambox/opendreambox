SRC_URI[dm7080.md5sum] = "5bd53ecf6eb3015bd9a42ab8ad1516c8"
SRC_URI[dm7080.sha256sum] = "4f4fcfa5db253087811e8b360b06e7d9bf0c01512db7c9a8ec763ae5e4628f8a"

require enigma2-bin-4.2.inc

COMPATIBLE_MACHINE = "^(dm820|dm7080)$"

PRECOMPILED_ARCH = "${@d.getVar('PV', True).split('-')[1]}"
PRECOMPILED_VERSION = "${@d.getVar('PV', True).split('-')[0]}"
