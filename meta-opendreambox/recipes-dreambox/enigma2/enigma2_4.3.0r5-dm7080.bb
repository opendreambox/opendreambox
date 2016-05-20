SRC_URI[dm7080.md5sum] = "6ffa9ec813cabb0c8904f12a006c1cec"
SRC_URI[dm7080.sha256sum] = "1d6a710713f6e6726524d421f80947e33eb8e8152c7daf42125c6a27bd465589"

require enigma2-bin-4.3.inc

COMPATIBLE_MACHINE = "^(dm820|dm7080)$"

PRECOMPILED_ARCH = "${@d.getVar('PV', True).split('-')[1]}"
PRECOMPILED_VERSION = "${@d.getVar('PV', True).split('-')[0]}"
