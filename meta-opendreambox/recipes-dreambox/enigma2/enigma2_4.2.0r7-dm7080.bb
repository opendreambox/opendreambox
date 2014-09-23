SRC_URI[dm7080.md5sum] = "669c456426ae2fc6c0da30c4a68394ac"
SRC_URI[dm7080.sha256sum] = "a7a8527bf7992111fe2b8a75e87dbd4de74662f1a45455246b0f3666bef69688"

require enigma2-bin-4.2.inc

COMPATIBLE_MACHINE = "^(dm7080)$"

PRECOMPILED_ARCH = "${@d.getVar('PV', True).split('-')[1]}"
PRECOMPILED_VERSION = "${@d.getVar('PV', True).split('-')[0]}"
