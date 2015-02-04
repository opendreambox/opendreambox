SRC_URI[dm7080.md5sum] = "a794f8e8bf17abab17e1f2c54519f2c5"
SRC_URI[dm7080.sha256sum] = "972edd55c2152db368bffefdd346f9ea6bcad78679d0b8cab64d08ac30fe19cf"

require enigma2-bin-4.2.inc

COMPATIBLE_MACHINE = "^(dm820|dm7080)$"

PRECOMPILED_ARCH = "${@d.getVar('PV', True).split('-')[1]}"
PRECOMPILED_VERSION = "${@d.getVar('PV', True).split('-')[0]}"
