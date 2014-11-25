SRC_URI[dm7080.md5sum] = "50b9b29db4335c9fe1ac72c38da0e931"
SRC_URI[dm7080.sha256sum] = "3ceb033e8e7e570de20f4b43e369a995193bb7351055468d4f54248fdaa3839a"

require enigma2-bin-4.2.inc

COMPATIBLE_MACHINE = "^(dm7080)$"

PRECOMPILED_ARCH = "${@d.getVar('PV', True).split('-')[1]}"
PRECOMPILED_VERSION = "${@d.getVar('PV', True).split('-')[0]}"
