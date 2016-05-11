SRC_URI[dm7080.md5sum] = "79fd26925233737d750ffcd6390eb40c"
SRC_URI[dm7080.sha256sum] = "17f4a520f1ee88228228a003ed3e524e1491a57796dfd1c651d99b38e0729936"

require enigma2-bin-4.3.inc

COMPATIBLE_MACHINE = "^(dm820|dm7080)$"

PRECOMPILED_ARCH = "${@d.getVar('PV', True).split('-')[1]}"
PRECOMPILED_VERSION = "${@d.getVar('PV', True).split('-')[0]}"
