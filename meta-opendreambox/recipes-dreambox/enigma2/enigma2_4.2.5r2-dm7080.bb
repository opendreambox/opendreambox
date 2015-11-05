SRC_URI[dm7080.md5sum] = "2191ce715d602aa6b4868c447ac4f712"
SRC_URI[dm7080.sha256sum] = "dd608a5ba245db897d6d8b0ffbf8ea6c77f259116c6376694e64b981a87dd7f5"

require enigma2-bin-4.2.inc

SRC_URI += "file://0001-re-add-global-VideoHardware-instance-without-this-on.patch"

COMPATIBLE_MACHINE = "^(dm820|dm7080)$"

PRECOMPILED_ARCH = "${@d.getVar('PV', True).split('-')[1]}"
PRECOMPILED_VERSION = "${@d.getVar('PV', True).split('-')[0]}"
