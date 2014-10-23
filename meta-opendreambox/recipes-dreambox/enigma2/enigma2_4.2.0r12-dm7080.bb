SRC_URI[dm7080.md5sum] = "aae4c0aa713d03e69c85f5fd78e64c1a"
SRC_URI[dm7080.sha256sum] = "a65d5ae1dd4145fdd2293b4626e5c14684346ccaf7d8906d87dae5409f2703f3"

require enigma2-bin-4.2.inc

COMPATIBLE_MACHINE = "^(dm7080)$"

PRECOMPILED_ARCH = "${@d.getVar('PV', True).split('-')[1]}"
PRECOMPILED_VERSION = "${@d.getVar('PV', True).split('-')[0]}"
