SRC_URI[dm7080.md5sum] = "ad7bb01f45aba70cc1edc0fb984fe9db"
SRC_URI[dm7080.sha256sum] = "fbdb52911b05ae4c3b4efc4ff35a4b33df106aa6977bdc1d76f699a9c9fcabec"

require enigma2-bin-4.2.inc

COMPATIBLE_MACHINE = "^(dm820|dm7080)$"

PRECOMPILED_ARCH = "${@d.getVar('PV', True).split('-')[1]}"
PRECOMPILED_VERSION = "${@d.getVar('PV', True).split('-')[0]}"
