SRC_URI[dm7080.md5sum] = "2fda4049238722bf4e89c951a87006cf"
SRC_URI[dm7080.sha256sum] = "591f462d7a59f0e4a2437c7e81027e43e3e3a8a4b0d4680b966983b4f3662b0f"

require enigma2-bin-4.2.inc

COMPATIBLE_MACHINE = "^(dm820|dm7080)$"

PRECOMPILED_ARCH = "${@d.getVar('PV', True).split('-')[1]}"
PRECOMPILED_VERSION = "${@d.getVar('PV', True).split('-')[0]}"
