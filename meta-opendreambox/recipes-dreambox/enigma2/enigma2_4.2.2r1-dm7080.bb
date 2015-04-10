SRC_URI[dm7080.md5sum] = "488ac7c5c91148b5748a7914301b67a5"
SRC_URI[dm7080.sha256sum] = "284dbe059ce5201baac7ff95ef4cbf03437b2f74eb3c64caffdc19908ad971b5"

require enigma2-bin-4.2.inc

COMPATIBLE_MACHINE = "^(dm820|dm7080)$"

PRECOMPILED_ARCH = "${@d.getVar('PV', True).split('-')[1]}"
PRECOMPILED_VERSION = "${@d.getVar('PV', True).split('-')[0]}"
