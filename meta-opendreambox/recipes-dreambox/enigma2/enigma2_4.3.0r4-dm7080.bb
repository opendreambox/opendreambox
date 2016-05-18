SRC_URI[dm7080.md5sum] = "ea43134fab33939a152bc3f79153f47f"
SRC_URI[dm7080.sha256sum] = "647b00473aed81aaff54bc6e9f555db99f664ee281cfb6b8afa0a50cf1a553a9"

require enigma2-bin-4.3.inc

COMPATIBLE_MACHINE = "^(dm820|dm7080)$"

PRECOMPILED_ARCH = "${@d.getVar('PV', True).split('-')[1]}"
PRECOMPILED_VERSION = "${@d.getVar('PV', True).split('-')[0]}"
