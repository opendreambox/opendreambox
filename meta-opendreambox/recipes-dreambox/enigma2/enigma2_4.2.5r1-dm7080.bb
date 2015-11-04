SRC_URI[dm7080.md5sum] = "a195c4299422b0e43e5e1676e082d25b"
SRC_URI[dm7080.sha256sum] = "33685fed654c65f69b8787e92e94a6d7468ba8735b6fc50e1f3a732735048b0b"

require enigma2-bin-4.2.inc

COMPATIBLE_MACHINE = "^(dm820|dm7080)$"

PRECOMPILED_ARCH = "${@d.getVar('PV', True).split('-')[1]}"
PRECOMPILED_VERSION = "${@d.getVar('PV', True).split('-')[0]}"
