SUMMARY = "Dreambox second stage bootloader"
PROVIDES = "virtual/bootloader"
PRECOMPILED_ARCH = "${@d.getVar('PV', True).split('-')[1]}"
PRECOMPILED_VERSION = "${@d.getVar('PV', True).split('-')[0]}"

SRC_URI[dm7080.md5sum] = "43a2f293d73e15bf627102fc364e41a9"
SRC_URI[dm7080.sha256sum] = "b9302781de150c98a05e7159f9fa883f970960467317b7c6cdbb3470132cf03a"

inherit opendreambox-precompiled-binary

PACKAGE_ARCH := "${MACHINE_ARCH}"

RDEPENDS_${PN} = "flash-scripts"

pkg_postinst_${PN}() {
if [ -z "$D" ] && grep -q '^${PRECOMPILED_ARCH}$' /proc/stb/info/model; then
    flash-ssbl ${datadir}/${PN}/ssbl.bin
fi
}

COMPATIBLE_MACHINE = "^(dm7080)$"
