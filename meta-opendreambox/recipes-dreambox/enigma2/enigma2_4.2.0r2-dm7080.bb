SRC_URI[dm7080.md5sum] = "de0f62f981fba95c5b6b0ecc5ad64e1e"
SRC_URI[dm7080.sha256sum] = "906ba8684fafaf82cfeb09c31cdaaddf8d2a8efeddcc9002e191ed51a700e31c"

require enigma2-bin-4.2.inc

COMPATIBLE_MACHINE = "^(dm7080)$"

PRECOMPILED_ARCH = "${@d.getVar('PV', True).split('-')[1]}"
PRECOMPILED_VERSION = "${@d.getVar('PV', True).split('-')[0]}"
