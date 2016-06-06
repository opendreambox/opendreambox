SUMMARY = "Dreambox second stage bootloader"
PROVIDES = "virtual/bootloader"
PRECOMPILED_ARCH = "${@d.getVar('PV', True).split('-')[1]}"
PRECOMPILED_VERSION = "${@d.getVar('PV', True).split('-')[0]}"

SRC_URI[dm520.md5sum] = "b8907aaabc8a08b427ffef8b8b330d9e"
SRC_URI[dm520.sha256sum] = "47a681e31797ff1fcdb5b029065bff519544c7fe7d8615d48f6a7fb9c804b48d"

inherit opendreambox-precompiled-binary

PACKAGE_ARCH := "${MACHINE_ARCH}"

RDEPENDS_${PN} = "flash-scripts"

pkg_postinst_${PN}() {
[ -n "$D" ] || flash-ssbl ${datadir}/${PN}/ssbl.bin
}

COMPATIBLE_MACHINE = "^(dm520)$"
