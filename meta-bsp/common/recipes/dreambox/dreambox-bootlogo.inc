SUMMARY = "Bootlogo support"
SECTION = "base"
LICENSE = "CLOSED"
PRIORITY = "required"

inherit opendreambox-precompiled-binary opendreambox-sysvinit

PRECOMPILED_ARCH = "${@d.getVar('PV', True).split('-')[1]}"
PRECOMPILED_VERSION = "${@d.getVar('PV', True).split('-')[0]}"

PACKAGES += "${PN}-data"

PACKAGE_ARCH := "${MACHINE_ARCH}"

RDEPENDS_${PN} = "${PN}-data"

FILES_${PN} = "/boot/bootlogo.elf.gz"
FILES_${PN}-data = "/boot/bootlogo.jpg ${datadir} ${sysconfdir}"

pkg_preinst_${PN}() {
        if [ -z "$D" ] && mountpoint -q /boot; then mount -o remount,rw /boot; fi
}
pkg_prerm_${PN}() {
        if [ -z "$D" ] && mountpoint -q /boot; then mount -o remount,rw /boot; fi
}
pkg_postinst_${PN}() {
        if [ -z "$D" ] && mountpoint -q /boot; then mount -o remount,ro /boot; fi
}
pkg_postrm_${PN}() {
        if [ -z "$D" ] && mountpoint -q /boot; then mount -o remount,ro /boot; fi
}

pkg_preinst_${PN}-data() {
        if [ -z "$D" ] && mountpoint -q /boot; then mount -o remount,rw /boot; fi
}
pkg_prerm_${PN}-data() {
        if [ -z "$D" ] && mountpoint -q /boot; then mount -o remount,rw /boot; fi
}
pkg_postinst_${PN}-data() {
        if [ -z "$D" ] && mountpoint -q /boot; then mount -o remount,ro /boot; fi
}
pkg_postrm_${PN}-data() {
        if [ -z "$D" ] && mountpoint -q /boot; then mount -o remount,ro /boot; fi
}

INITSCRIPT_PARAMS = "start 3 S . stop 89 0 ."
