SRC_URI[dm7080.md5sum] = "04ba1c4e8a4beb39d0d77cb9645e8c7a"
SRC_URI[dm7080.sha256sum] = "9b8161f3543dac5c543a8f3011a7bb672117f3f7f93f2ee7fcb2847f3ed9b5a8"

require enigma2-bin-4.2.inc

COMPATIBLE_MACHINE = "^(dm7080)$"

PRECOMPILED_ARCH = "${@d.getVar('PV', True).split('-')[1]}"
PRECOMPILED_VERSION = "${@d.getVar('PV', True).split('-')[0]}"
