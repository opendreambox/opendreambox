SRC_URI[dm7080.md5sum] = "cfd06cff83b62557c58587d5cab528d0"
SRC_URI[dm7080.sha256sum] = "bbb4365055ff2ec917d527b2cad66633a42aae626b7310bd5bac87bbf83332e8"

require enigma2-bin-4.2.inc

COMPATIBLE_MACHINE = "^(dm7080)$"

PRECOMPILED_ARCH = "${@d.getVar('PV', True).split('-')[1]}"
PRECOMPILED_VERSION = "${@d.getVar('PV', True).split('-')[0]}"
