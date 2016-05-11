SRC_URI[dm7080.md5sum] = "9f5b6b4272f6a5a0ba0510fc9f82d3a5"
SRC_URI[dm7080.sha256sum] = "07e676ba18d974bce8728ee84018f270c3005e5f9f46b125207b339fd2488e6d"

require enigma2-bin-4.2.inc

COMPATIBLE_MACHINE = "^(dm820|dm7080)$"

PRECOMPILED_ARCH = "${@d.getVar('PV', True).split('-')[1]}"
PRECOMPILED_VERSION = "${@d.getVar('PV', True).split('-')[0]}"
