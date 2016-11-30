SUMMARY = "Dreambox second stage bootloader"
PROVIDES = "virtual/bootloader"
PRECOMPILED_VERSION = "${@d.getVar('PV', True).split('-')[0]}"

SRC_URI[dm820.md5sum] = "597f55dbc5b87133d305690db41c0c8e"
SRC_URI[dm820.sha256sum] = "26afa1d0922f95bedf3856b8ad7866453c2ffc1da2d2cee17b79f11fa077afe6"

inherit opendreambox-precompiled-binary

PACKAGE_ARCH := "${MACHINE_ARCH}"

RDEPENDS_${PN} = "flash-scripts"

pkg_postinst_${PN}() {
[ -n "$D" ] || flash-ssbl ${datadir}/${PN}/ssbl.bin
}
