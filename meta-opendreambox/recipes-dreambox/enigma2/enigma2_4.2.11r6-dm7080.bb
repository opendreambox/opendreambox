SRC_URI[dm7080.md5sum] = "567eb11e44e7cad12daf0e9d4f31f99f"
SRC_URI[dm7080.sha256sum] = "94bf6eef84728e5b845fd67c423a5107d20ec7c9a325f58b7854c672e78ae41d"

require enigma2-bin-4.2.inc

COMPATIBLE_MACHINE = "^(dm820|dm7080)$"

PRECOMPILED_ARCH = "${@d.getVar('PV', True).split('-')[1]}"
PRECOMPILED_VERSION = "${@d.getVar('PV', True).split('-')[0]}"
