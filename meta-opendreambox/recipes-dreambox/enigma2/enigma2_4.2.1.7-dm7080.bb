SRC_URI[dm7080.md5sum] = "649a1848a55015eb8fedff10ad38087d"
SRC_URI[dm7080.sha256sum] = "167a0d139e1fbee13b4a561b50aad64e6fc975bf596c021d9788ad0e87c03975"

require enigma2-bin-4.2.inc

COMPATIBLE_MACHINE = "^(dm820|dm7080)$"

PRECOMPILED_ARCH = "${@d.getVar('PV', True).split('-')[1]}"
PRECOMPILED_VERSION = "${@d.getVar('PV', True).split('-')[0]}"
