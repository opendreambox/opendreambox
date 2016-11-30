SUMMARY = "Dreambox second stage bootloader"
PROVIDES = "virtual/bootloader"
PRECOMPILED_VERSION = "${@d.getVar('PV', True).split('-')[0]}"

SRC_URI[dm7080.md5sum] = "ef12410e7944e23cffaa6753531d7bdd"
SRC_URI[dm7080.sha256sum] = "c50354e66d6f247ab533a518b9df42c2067f6711cd210f9e25983233018df016"

inherit opendreambox-precompiled-binary

PACKAGE_ARCH := "${MACHINE_ARCH}"

RDEPENDS_${PN} = "flash-scripts"

pkg_postinst_${PN}() {
[ -n "$D" ] || flash-ssbl ${datadir}/${PN}/ssbl.bin
}
