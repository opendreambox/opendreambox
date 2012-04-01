DESCRIPTION = "Bootlogo support"
SECTION = "base"
LICENSE = "CLOSED"
PRIORITY = "required"
INC_PR = "r10"

inherit opendreambox-precompiled-binary opendreambox-sysvinit

do_install() {
        install -d ${D}/boot ${D}${datadir}/${PN}
        install -m 0755 bootlogo-${MACHINE}.elf.gz ${D}/boot
        install -m 0644 bootlogo-${MACHINE}.jpg ${D}/boot
        for file in *.mvi; do
                install -m 0644 $file ${D}${datadir}/${PN}
                ln -s ${PN}/$file ${D}${datadir}
        done
}

PACKAGES += "${PN}-data"

PACKAGE_ARCH := "${MACHINE_ARCH}"

RDEPENDS_${PN} = "${PN}-data"

FILES_${PN} = "/boot/bootlogo-${MACHINE}.elf.gz"
FILES_${PN}-data = "/boot/bootlogo-${MACHINE}.jpg ${datadir} ${sysconfdir}"

pkg_preinst() {
        if [ -z "$D" ] && mountpoint -q /boot; then mount -o remount,rw /boot; fi
}
pkg_prerm() {
        if [ -z "$D" ] && mountpoint -q /boot; then mount -o remount,rw /boot; fi
}
pkg_postinst() {
        if [ -z "$D" ] && mountpoint -q /boot; then mount -o remount,ro /boot; fi
}
pkg_postrm() {
        if [ -z "$D" ] && mountpoint -q /boot; then mount -o remount,ro /boot; fi
}

INITSCRIPT_PARAMS = "start 3 S . stop 89 0 ."
