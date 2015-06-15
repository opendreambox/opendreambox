SRC_URI[dm7080.md5sum] = "647dfa1c9a41a39fbd1069320f648446"
SRC_URI[dm7080.sha256sum] = "10230387ae2b80b5bc5351838c91c467d3530b5d137b342316e28ebc69f1541a"

require enigma2-bin-4.2.inc

SRC_URI += " file://0001-InfoBar-fix-EventList-Timeshift-overlap-with-config..patch"

COMPATIBLE_MACHINE = "^(dm820|dm7080)$"

PRECOMPILED_ARCH = "${@d.getVar('PV', True).split('-')[1]}"
PRECOMPILED_VERSION = "${@d.getVar('PV', True).split('-')[0]}"
