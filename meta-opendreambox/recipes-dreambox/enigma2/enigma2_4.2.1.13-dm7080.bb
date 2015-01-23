SRC_URI[dm7080.md5sum] = "283b48cda6b97f4846919d9a55a4fdea"
SRC_URI[dm7080.sha256sum] = "29147c16728baa8cdaf897543438d80bf02bf16f3d6d0e3ffde8e7dd1d6aa6d2"

require enigma2-bin-4.2.inc

COMPATIBLE_MACHINE = "^(dm820|dm7080)$"

PRECOMPILED_ARCH = "${@d.getVar('PV', True).split('-')[1]}"
PRECOMPILED_VERSION = "${@d.getVar('PV', True).split('-')[0]}"
