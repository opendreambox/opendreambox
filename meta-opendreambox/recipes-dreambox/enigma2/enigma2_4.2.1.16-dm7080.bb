SRC_URI[dm7080.md5sum] = "d343b3938945a2d6eeed147e88b00ce7"
SRC_URI[dm7080.sha256sum] = "1996af5292b552b15bc3304f6268782f607115015ba8a5876193bd9d1115f948"

require enigma2-bin-4.2.inc

COMPATIBLE_MACHINE = "^(dm820|dm7080)$"

PRECOMPILED_ARCH = "${@d.getVar('PV', True).split('-')[1]}"
PRECOMPILED_VERSION = "${@d.getVar('PV', True).split('-')[0]}"
