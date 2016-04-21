SRC_URI[dm7080.md5sum] = "495079ac9cb8b90f044872688cc8d308"
SRC_URI[dm7080.sha256sum] = "1e42fc979d34f857fc0fc21b984e6eae89b9f9ff27cc5c5e29934c2b2f6d887a"

require enigma2-bin-4.3.inc

COMPATIBLE_MACHINE = "^(dm820|dm7080)$"

PRECOMPILED_ARCH = "${@d.getVar('PV', True).split('-')[1]}"
PRECOMPILED_VERSION = "${@d.getVar('PV', True).split('-')[0]}"
