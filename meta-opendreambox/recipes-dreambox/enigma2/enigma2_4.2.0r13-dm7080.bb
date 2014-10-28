SRC_URI[dm7080.md5sum] = "17b03b262c4bcea1cde87cd6b6df0e3d"
SRC_URI[dm7080.sha256sum] = "584d37faefce1180f39e424a185a4a8e96f23bd8c1d8c55e021e4ec67533e313"

require enigma2-bin-4.2.inc

COMPATIBLE_MACHINE = "^(dm7080)$"

PRECOMPILED_ARCH = "${@d.getVar('PV', True).split('-')[1]}"
PRECOMPILED_VERSION = "${@d.getVar('PV', True).split('-')[0]}"
