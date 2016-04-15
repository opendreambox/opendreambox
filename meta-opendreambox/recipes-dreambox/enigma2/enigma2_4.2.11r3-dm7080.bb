SRC_URI[dm7080.md5sum] = "976cf2237e714b45832c1a6d1ca181d9"
SRC_URI[dm7080.sha256sum] = "1b1bec87e5d2f8dfd3fca68864aef754812e37f5141a38255c38364b6ce1fd81"

require enigma2-bin-4.2.inc

COMPATIBLE_MACHINE = "^(dm820|dm7080)$"

PRECOMPILED_ARCH = "${@d.getVar('PV', True).split('-')[1]}"
PRECOMPILED_VERSION = "${@d.getVar('PV', True).split('-')[0]}"
