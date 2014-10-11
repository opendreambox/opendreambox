SRC_URI[dm7080.md5sum] = "64d6f1334b71904102c7c57fe6f81e6d"
SRC_URI[dm7080.sha256sum] = "c9a1180eec7f647f073e130f01252d108d5118f58330b3770cc1918f07abf27b"

require enigma2-bin-4.2.inc

COMPATIBLE_MACHINE = "^(dm7080)$"

PRECOMPILED_ARCH = "${@d.getVar('PV', True).split('-')[1]}"
PRECOMPILED_VERSION = "${@d.getVar('PV', True).split('-')[0]}"
