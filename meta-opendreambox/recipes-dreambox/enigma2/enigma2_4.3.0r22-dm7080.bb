SRC_URI[dm7080.md5sum] = "40b87c3a180e6a99228ffd134a69a9b7"
SRC_URI[dm7080.sha256sum] = "6485aecc7a4f2b64b02215f02701c5ffa80aa958ba032b92d4fdbe7be23dfdf0"

require enigma2-bin-4.3.inc

COMPATIBLE_MACHINE = "^(dm520|dm820|dm7080)$"

PRECOMPILED_ARCH = "${@d.getVar('PV', True).split('-')[1]}"
PRECOMPILED_VERSION = "${@d.getVar('PV', True).split('-')[0]}"
