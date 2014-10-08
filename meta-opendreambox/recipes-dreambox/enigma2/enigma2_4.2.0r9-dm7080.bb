SRC_URI[dm7080.md5sum] = "b162b52abd0aeff68ee46a5d4f9438cf"
SRC_URI[dm7080.sha256sum] = "2f752195845f53a588f8871a742bd5abadb082320afaac95c4c88b377f0633d1"

require enigma2-bin-4.2.inc

COMPATIBLE_MACHINE = "^(dm7080)$"

PRECOMPILED_ARCH = "${@d.getVar('PV', True).split('-')[1]}"
PRECOMPILED_VERSION = "${@d.getVar('PV', True).split('-')[0]}"
