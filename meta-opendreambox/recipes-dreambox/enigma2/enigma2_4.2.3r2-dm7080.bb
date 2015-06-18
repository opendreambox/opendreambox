SRC_URI[dm7080.md5sum] = "96e561b33d55e72d3ffaef04c4fc6c6b"
SRC_URI[dm7080.sha256sum] = "12cc2d261a729f5302c9d5b7435298d342f99ceaa4be80645ec548de2cfa65d6"

require enigma2-bin-4.2.inc

SRC_URI += " file://0001-execBegin-should-not-show-screens-which-was-not-visi.patch"

COMPATIBLE_MACHINE = "^(dm820|dm7080)$"

PRECOMPILED_ARCH = "${@d.getVar('PV', True).split('-')[1]}"
PRECOMPILED_VERSION = "${@d.getVar('PV', True).split('-')[0]}"
