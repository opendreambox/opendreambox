SUMMARY = "Dreambox second stage bootloader"
PROVIDES = "virtual/bootloader"
PRECOMPILED_ARCH = "${@d.getVar('PV', True).split('-')[1]}"
PRECOMPILED_VERSION = "${@d.getVar('PV', True).split('-')[0]}"

SRC_URI[dm7080.md5sum] = "f8ae44006c7bc4ea9e4871eb42194196"
SRC_URI[dm7080.sha256sum] = "cf1a651afc8acfc6daf04650c81453f001156e9578c54d7cc281b482fa8330a1"

inherit opendreambox-precompiled-binary

PACKAGE_ARCH := "${MACHINE_ARCH}"

RDEPENDS_${PN} = "flash-scripts"

pkg_postinst_${PN}() {
[ -n "$D" ] || flash-ssbl ${datadir}/${PN}/ssbl.bin
}

COMPATIBLE_MACHINE = "^(dm7080)$"
