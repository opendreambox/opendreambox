SRC_URI[dm7080.md5sum] = "1fa080a5343c64afcd885c69c384a225"
SRC_URI[dm7080.sha256sum] = "b142adfe51c7e1fe6db886d30abaa58f1e3440e3a02800cc0c130f81404773f6"

require enigma2-bin-4.3.inc

COMPATIBLE_MACHINE = "^(dm820|dm7080)$"

PRECOMPILED_ARCH = "${@d.getVar('PV', True).split('-')[1]}"
PRECOMPILED_VERSION = "${@d.getVar('PV', True).split('-')[0]}"
