SUMMARY = "Dreambox second stage bootloader"
PROVIDES = "virtual/bootloader"
PRECOMPILED_VERSION = "${@d.getVar('PV', True).split('-')[0]}"

SRC_URI[dm520.md5sum] = "e1b388c62396e57b3c359fcc922eedad"
SRC_URI[dm520.sha256sum] = "d2253ab36ee0871206d019126e15750ae1eaefccf4cb11b6dca834d16f81c415"

inherit opendreambox-precompiled-binary

PACKAGE_ARCH := "${MACHINE_ARCH}"

RDEPENDS_${PN} = "flash-scripts"

pkg_postinst_${PN}() {
[ -n "$D" ] || flash-ssbl ${datadir}/${PN}/ssbl.bin
}
