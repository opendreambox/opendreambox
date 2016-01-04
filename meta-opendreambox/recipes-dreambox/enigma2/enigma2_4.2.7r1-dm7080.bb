SRC_URI[dm7080.md5sum] = "518c687741b7a23ba55d99ecf13cab5e"
SRC_URI[dm7080.sha256sum] = "706caf8b9a7842d61bf53c70778c840f362d5f37ea7019c36ecdc4800429c583"

require enigma2-bin-4.2.inc

COMPATIBLE_MACHINE = "^(dm820|dm7080)$"

PRECOMPILED_ARCH = "${@d.getVar('PV', True).split('-')[1]}"
PRECOMPILED_VERSION = "${@d.getVar('PV', True).split('-')[0]}"
