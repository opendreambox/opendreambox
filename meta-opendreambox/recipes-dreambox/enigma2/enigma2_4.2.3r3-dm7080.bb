SRC_URI[dm7080.md5sum] = "829eb2a49e23c4b2f8ab60e2e2fd3d77"
SRC_URI[dm7080.sha256sum] = "3fe988afc1961ad51c01312fa72e811547e91f3ef6a7f472e577e818d4496654"

require enigma2-bin-4.2.inc

COMPATIBLE_MACHINE = "^(dm820|dm7080)$"

PRECOMPILED_ARCH = "${@d.getVar('PV', True).split('-')[1]}"
PRECOMPILED_VERSION = "${@d.getVar('PV', True).split('-')[0]}"
