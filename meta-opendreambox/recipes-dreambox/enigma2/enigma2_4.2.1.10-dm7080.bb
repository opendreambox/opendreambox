SRC_URI[dm7080.md5sum] = "4dd2863cf9966d23a81458ae339dfad3"
SRC_URI[dm7080.sha256sum] = "c23ef10f9a6670413e8ccb83c79513bc51ae42ad8788e887020a2b2f4e5fb28d"

require enigma2-bin-4.2.inc

COMPATIBLE_MACHINE = "^(dm820|dm7080)$"

PRECOMPILED_ARCH = "${@d.getVar('PV', True).split('-')[1]}"
PRECOMPILED_VERSION = "${@d.getVar('PV', True).split('-')[0]}"
