SRC_URI[dm7080.md5sum] = "1537f5e4b049894e2b7fa7e1e3a6c96a"
SRC_URI[dm7080.sha256sum] = "0b92527133a6df96971d8c21b898fb1c5e1d2c5e0ad0b059506290c6572a12c2"

require enigma2-bin-4.2.inc

COMPATIBLE_MACHINE = "^(dm820|dm7080)$"

PRECOMPILED_ARCH = "${@d.getVar('PV', True).split('-')[1]}"
PRECOMPILED_VERSION = "${@d.getVar('PV', True).split('-')[0]}"
