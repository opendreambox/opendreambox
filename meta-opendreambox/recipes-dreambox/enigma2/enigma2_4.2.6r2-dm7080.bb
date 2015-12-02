SRC_URI[dm7080.md5sum] = "311bbb021a9bb93dbaa6bbe0ad45b550"
SRC_URI[dm7080.sha256sum] = "0f3a78be018694e8d50dd6de554ecbf9ed8e33db39dadd219ee71f8290d3c53a"

require enigma2-bin-4.2.inc

SRC_URI += " \
	file://0001-StartWizard-Add-missing-nextstep-to-networks-already.patch \
	file://0002-Screen-call-_initAnimations-in-onLayoutFinish-so-it-.patch \
	file://0003-startwizard-jump-to-correct-step-when-network-wizard.patch \
"

COMPATIBLE_MACHINE = "^(dm820|dm7080)$"

PRECOMPILED_ARCH = "${@d.getVar('PV', True).split('-')[1]}"
PRECOMPILED_VERSION = "${@d.getVar('PV', True).split('-')[0]}"
