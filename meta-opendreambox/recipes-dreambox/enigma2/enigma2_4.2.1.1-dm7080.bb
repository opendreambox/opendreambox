SRC_URI[dm7080.md5sum] = "8b71602ce2da50b1755f50218331321a"
SRC_URI[dm7080.sha256sum] = "39986c6fa849970437bc37554f151e417a9dfe6ffdb95e64f5a50e3a4ac996d3"

require enigma2-bin-4.2.inc

COMPATIBLE_MACHINE = "^(dm7080)$"

PRECOMPILED_ARCH = "${@d.getVar('PV', True).split('-')[1]}"
PRECOMPILED_VERSION = "${@d.getVar('PV', True).split('-')[0]}"
