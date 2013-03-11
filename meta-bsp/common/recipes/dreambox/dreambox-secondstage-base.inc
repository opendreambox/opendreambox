SUMMARY = "Dreambox second stage bootloader"
SECTION = "base"
LICENSE = "CLOSED"
PROVIDES = "virtual/bootloader"
PRIORITY = "required"
INC_PR = "r12"

do_install() {
        install -d ${D}${datadir}/${PN}
        install -m 0644 secondstage-${MACHINE}-${PV}.bin ${D}${datadir}/${PN}/secondstage-${MACHINE}.bin
}

PACKAGES = "${PN} ${PN}-bin"

PACKAGE_ARCH := "${MACHINE_ARCH}"

RDEPENDS_${PN} = "mtd-utils-nandwrite mtd-utils-mtd-debug dreambox-buildimage"

FILES_${PN} = "${datadir}/${PN}/secondstage-${MACHINE}.bin"

pkg_postinst_${PN}() {
if [ -z "$D" ] && grep -q '\<${MACHINE}\>' /proc/stb/info/model; then
	buildimage --arch=${MACHINE} --flash-size=${DREAMBOX_FLASH_SIZE} --raw ${EXTRA_BUILDCMD} \
		--erase-block-size=`mtd_debug info /dev/mtd1 | grep '^mtd\.erasesize' | awk '{print $3}'` \
		--sector-size=`mtd_debug info /dev/mtd1 | grep '^mtd\.writesize' | awk '{print $3}'` \
		--boot-partition=${DREAMBOX_PART0_SIZE}:${datadir}/${PN}/secondstage-${MACHINE}.bin \
		> /var/tmp/secondstage.nand
	mtd_debug erase /dev/mtd1 0 `mtd_debug info /dev/mtd1 | grep '^mtd\.size' | awk '{print $3}'`
	nandwrite -m -n -o /dev/mtd1 /var/tmp/secondstage.nand
	sync
fi
}
