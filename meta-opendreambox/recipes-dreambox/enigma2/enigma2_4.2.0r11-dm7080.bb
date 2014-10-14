SRC_URI[dm7080.md5sum] = "eccf07a7525517ca5c6048e230263bbe"
SRC_URI[dm7080.sha256sum] = "c787d2db6452f7e85a43f0735be1d3a457c7120ec846cc31ebb6e35c2ca14c4c"

require enigma2-bin-4.2.inc

COMPATIBLE_MACHINE = "^(dm7080)$"

PRECOMPILED_ARCH = "${@d.getVar('PV', True).split('-')[1]}"
PRECOMPILED_VERSION = "${@d.getVar('PV', True).split('-')[0]}"
