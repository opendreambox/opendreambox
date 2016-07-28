SRC_URI[dm7080.md5sum] = "0d44819696827c9218481859aa06a49c"
SRC_URI[dm7080.sha256sum] = "ad00a6d91101203fb6ee87dbd6e2978ac392340aabe7dcd6a15ede0f6ad0c599"

require enigma2-bin-4.3.inc

COMPATIBLE_MACHINE = "^(dm520|dm820|dm7080)$"

PRECOMPILED_ARCH = "${@d.getVar('PV', True).split('-')[1]}"
PRECOMPILED_VERSION = "${@d.getVar('PV', True).split('-')[0]}"

SRC_URI += " \
	file://0001-picon-resolver-change.patch \
	file://0002-MediaCenter-fix-crash-in-MediaBrowserFile.patch \
	file://0003-ChannelSelectionRadio-tie-radio-infobar-show-hide-to.patch \
	file://0004-RdsInfoDisplay-don-t-be-fullscreen.patch \
"
