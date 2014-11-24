SRC_URI[dm7080.md5sum] = "82e153fc721e3f5a79fe71b9cdfb7c75"
SRC_URI[dm7080.sha256sum] = "7d981adb407176af9c21ff7c2255952e3b5dccd9c70bc863f7ca287cc8a8eb2b"

require enigma2-bin-4.2.inc

COMPATIBLE_MACHINE = "^(dm7080)$"

PRECOMPILED_ARCH = "${@d.getVar('PV', True).split('-')[1]}"
PRECOMPILED_VERSION = "${@d.getVar('PV', True).split('-')[0]}"
