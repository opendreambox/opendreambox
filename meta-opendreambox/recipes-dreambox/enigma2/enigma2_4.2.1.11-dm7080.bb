SRC_URI[dm7080.md5sum] = "df7dfe9a110ce8e80326ff119f56a4eb"
SRC_URI[dm7080.sha256sum] = "df77765b1d75bcb76f8888b1bd8c5299e3cb961716eefd6f76e3edb63529f79c"

require enigma2-bin-4.2.inc

COMPATIBLE_MACHINE = "^(dm820|dm7080)$"

PRECOMPILED_ARCH = "${@d.getVar('PV', True).split('-')[1]}"
PRECOMPILED_VERSION = "${@d.getVar('PV', True).split('-')[0]}"
