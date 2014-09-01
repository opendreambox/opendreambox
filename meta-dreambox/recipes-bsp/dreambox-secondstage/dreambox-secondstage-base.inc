SUMMARY = "Dreambox second stage bootloader"
SECTION = "base"
LICENSE = "CLOSED"
PROVIDES = "virtual/bootloader"
PRIORITY = "required"

PRECOMPILED_ARCH ?= "${MACHINE_ARCH}"

do_install() {
        install -d ${D}${datadir}/${PN}
        install -m 0644 secondstage-${PRECOMPILED_ARCH}-${PRECOMPILED_VERSION}.bin ${D}${datadir}/${PN}/secondstage-${PRECOMPILED_ARCH}.bin
}

PACKAGES = "${PN} ${PN}-bin"

PACKAGE_ARCH := "${MACHINE_ARCH}"

RDEPENDS_${PN} = "mtd-utils-nandwrite mtd-utils-mtd-debug dreambox-buildimage"

FILES_${PN} = "${datadir}/${PN}/secondstage-${PRECOMPILED_ARCH}.bin"

pkg_postinst_${PN}() {
if [ -z "$D" ] && grep -q '\<${PRECOMPILED_ARCH}\>' /proc/stb/info/model; then
	buildimage --arch=${PRECOMPILED_ARCH} --raw ${EXTRA_BUILDCMD} \
		--erase-block-size=`mtd_debug info /dev/mtd1 | grep '^mtd\.erasesize' | awk '{print $3}'` \
		--sector-size=`mtd_debug info /dev/mtd1 | grep '^mtd\.writesize' | awk '{print $3}'` \
		--boot-partition=${DREAMBOX_PART0_SIZE}:${datadir}/${PN}/secondstage-${PRECOMPILED_ARCH}.bin \
		> /var/tmp/secondstage.nand
	mtd_debug erase /dev/mtd1 0 `mtd_debug info /dev/mtd1 | grep '^mtd\.size' | awk '{print $3}'`
	nandwrite -m -n -o /dev/mtd1 /var/tmp/secondstage.nand
	sync
fi
}
