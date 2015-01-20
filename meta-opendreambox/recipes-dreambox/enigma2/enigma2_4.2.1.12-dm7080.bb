SRC_URI[dm7080.md5sum] = "53d9ffdc44caa2e167f045428445489f"
SRC_URI[dm7080.sha256sum] = "8817ed5d9459ac7d395d512bb5740d37481df111d3d3ac6671345f48146a61a1"

require enigma2-bin-4.2.inc

COMPATIBLE_MACHINE = "^(dm820|dm7080)$"

PRECOMPILED_ARCH = "${@d.getVar('PV', True).split('-')[1]}"
PRECOMPILED_VERSION = "${@d.getVar('PV', True).split('-')[0]}"
