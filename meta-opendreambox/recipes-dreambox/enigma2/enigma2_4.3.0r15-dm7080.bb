SRC_URI[dm7080.md5sum] = "e4d0f0d1a9863104562fcfe6c82d4471"
SRC_URI[dm7080.sha256sum] = "a1b6311a0850723358b8a45247ca5eb6a0783230fa69ba9db4b655e59861e341"

require enigma2-bin-4.3.inc

COMPATIBLE_MACHINE = "^(dm520|dm820|dm7080)$"

PRECOMPILED_ARCH = "${@d.getVar('PV', True).split('-')[1]}"
PRECOMPILED_VERSION = "${@d.getVar('PV', True).split('-')[0]}"
