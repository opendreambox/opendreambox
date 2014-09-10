SRC_URI[dm7080.md5sum] = "869b748235dc1c1c44e3dda08bdf71a2"
SRC_URI[dm7080.sha256sum] = "44e0867055759934c5b7476c53d8d3d91fb49a57eedae32c74d16053d253892b"

require enigma2-bin-4.2.inc

COMPATIBLE_MACHINE = "^(dm7080)$"

PRECOMPILED_ARCH = "${@d.getVar('PV', True).split('-')[1]}"
PRECOMPILED_VERSION = "${@d.getVar('PV', True).split('-')[0]}"
