SRC_URI[dm7080.md5sum] = "d800c122a4d218d1688381cf1b08f6f0"
SRC_URI[dm7080.sha256sum] = "790aa0162bcfd28ee3562128da0203a384b6f641d852c5b2eaae6ed53f45712e"

require enigma2-bin-4.3.inc

SRC_URI += " \
	file://0001-add-dm520-default-settings.patch \
	file://0002-disable-window-animations-for-dm520-by-default.patch \
	file://0001-dont-allow-recordings-for-dm520hd-because-of-missing.patch \
	file://0001-switch-to-new-skin-for-dm820-dm7080-dm520-after-fact.patch \
"

COMPATIBLE_MACHINE = "^(dm520|dm820|dm7080)$"

PRECOMPILED_ARCH = "${@d.getVar('PV', True).split('-')[1]}"
PRECOMPILED_VERSION = "${@d.getVar('PV', True).split('-')[0]}"
