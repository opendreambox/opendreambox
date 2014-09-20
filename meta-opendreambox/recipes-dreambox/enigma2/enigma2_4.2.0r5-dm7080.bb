SRC_URI[dm7080.md5sum] = "d4f74cf94ea41c8641f23d9753381342"
SRC_URI[dm7080.sha256sum] = "bc4f7441210e445d96a98926e01bcea859d7e08dca351691a78f24e189a5804d"

require enigma2-bin-4.2.inc

COMPATIBLE_MACHINE = "^(dm7080)$"

PRECOMPILED_ARCH = "${@d.getVar('PV', True).split('-')[1]}"
PRECOMPILED_VERSION = "${@d.getVar('PV', True).split('-')[0]}"
