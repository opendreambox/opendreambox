SUMMARY = "Dreambox second stage bootloader"
PROVIDES = "virtual/bootloader"
PRECOMPILED_ARCH = "${@d.getVar('PV', True).split('-')[1]}"
PRECOMPILED_VERSION = "${@d.getVar('PV', True).split('-')[0]}"

SRC_URI[dm7080.md5sum] = "c5febe94aed02841216ae90bf5cec242"
SRC_URI[dm7080.sha256sum] = "5110acf39ec4dcafdb9b6cebdaedd61b8727e0ac6a1c1d888cb56a1ac00bc2d2"

inherit opendreambox-precompiled-binary

PACKAGE_ARCH := "${MACHINE_ARCH}"

RDEPENDS_${PN} = "flash-scripts"

pkg_postinst_${PN}() {
[ -n "$D" ] || flash-ssbl ${datadir}/${PN}/ssbl.bin
}

COMPATIBLE_MACHINE = "^(dm7080)$"
