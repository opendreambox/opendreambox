SUMMARY = "Dreambox second stage bootloader"
SECTION = "base"
LICENSE = "CLOSED"
DEPENDS += "dreambox-buildimage-native"
PROVIDES = "virtual/bootloader"
PRIORITY = "required"
INC_PR = "r11"

do_compile() {
        ${DREAMBOX_BUILDIMAGE} \
                --boot-partition ${DREAMBOX_PART0_SIZE}:secondstage-${MACHINE}-${PV}.bin \
                --raw \
                > secondstage-${MACHINE}-${PV}.nand
}
do_install() {
        install -d ${D}${datadir}/${PN}
        install -m 0644 secondstage-${MACHINE}-${PV}.bin ${D}${datadir}/${PN}/secondstage-${MACHINE}.bin
        install -m 0644 secondstage-${MACHINE}-${PV}.nand ${D}${datadir}/${PN}/secondstage-${MACHINE}.nand
}

PACKAGES = "${PN} ${PN}-bin"

PACKAGE_ARCH := "${MACHINE_ARCH}"

RDEPENDS_${PN} = "mtd-utils-nandwrite mtd-utils-mtd-debug"

FILES_${PN} = "${datadir}/${PN}/secondstage-${MACHINE}.nand"
FILES_${PN}-bin = "${datadir}/${PN}/secondstage-${MACHINE}.bin"

pkg_postinst_${PN}() {
if [ -z "$D" ]; then
        mtd_debug erase /dev/mtd1 0 `mtd_debug info /dev/mtd1 | grep '^mtd\.size' | awk '{print $3}'`
        nandwrite -m -n -o /dev/mtd1 ${datadir}/${PN}/secondstage-${MACHINE}.nand
        sync
fi
}
