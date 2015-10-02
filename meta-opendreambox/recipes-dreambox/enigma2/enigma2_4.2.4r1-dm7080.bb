SRC_URI[dm7080.md5sum] = "f2d9e9e76795a47ffa08c2c4fa43f3c3"
SRC_URI[dm7080.sha256sum] = "201fb8967b71564967a4b0e110a6f979e6cd65b17122f306b6a3b2dfefad613d"

require enigma2-bin-4.2.inc

COMPATIBLE_MACHINE = "^(dm820|dm7080)$"

PRECOMPILED_ARCH = "${@d.getVar('PV', True).split('-')[1]}"
PRECOMPILED_VERSION = "${@d.getVar('PV', True).split('-')[0]}"
