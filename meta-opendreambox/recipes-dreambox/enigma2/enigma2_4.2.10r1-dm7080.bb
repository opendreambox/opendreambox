SRC_URI[dm7080.md5sum] = "bcc47a78d023ccec04ac3761dd0b4917"
SRC_URI[dm7080.sha256sum] = "b415d23bd9bc2a9c4b4d246a08f8307a4e34e04af5998889f6b401ea0a0ebcea"

require enigma2-bin-4.2.inc

COMPATIBLE_MACHINE = "^(dm820|dm7080)$"

PRECOMPILED_ARCH = "${@d.getVar('PV', True).split('-')[1]}"
PRECOMPILED_VERSION = "${@d.getVar('PV', True).split('-')[0]}"
