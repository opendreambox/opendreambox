SRC_URI[dm7080.md5sum] = "74a17842e78bc4dbff5a6aa5d001dcd1"
SRC_URI[dm7080.sha256sum] = "b1332c30a968586f199ed8e4806d330e9af545c7c725552c9d8fb45c560fb8d8"

require enigma2-bin-4.3.inc

SRC_URI += " \
	file://0001-add-dm520-default-settings.patch \
	file://0002-disable-window-animations-for-dm520-by-default.patch \
	file://0001-dont-allow-recordings-for-dm520hd-because-of-missing.patch \
"

COMPATIBLE_MACHINE = "^(dm520|dm820|dm7080)$"

PRECOMPILED_ARCH = "${@d.getVar('PV', True).split('-')[1]}"
PRECOMPILED_VERSION = "${@d.getVar('PV', True).split('-')[0]}"
