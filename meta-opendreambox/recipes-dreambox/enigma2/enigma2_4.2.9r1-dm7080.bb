SRC_URI[dm7080.md5sum] = "41b82b4eed9b61483b1cbe3085e1cb83"
SRC_URI[dm7080.sha256sum] = "e75578dd176f86b3bdca9092d54446e47731dbc7da710bb73ffdc999421a7761"

require enigma2-bin-4.2.inc

SRC_URI += " \
	file://0001-CommonInterfaceAssignment-propery-un-escape-xml-in-s.patch \
	file://0002-fixed-mistake.patch \
	file://0003-its-needed-to-initialize-self.immediatePlay-before-r.patch \
"

COMPATIBLE_MACHINE = "^(dm820|dm7080)$"

PRECOMPILED_ARCH = "${@d.getVar('PV', True).split('-')[1]}"
PRECOMPILED_VERSION = "${@d.getVar('PV', True).split('-')[0]}"
