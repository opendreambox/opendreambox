SUMMARY = "Bootlogo support"
LICENSE = "CLOSED"

SRCREV = "${@opendreambox_srcrev('b680994da2cc9771fb07bae0032126612ba4caf7', d)}"
SRC_URI += " \
        file://showiframe-backdrop.service \
        file://bootlogo.scr \
"

inherit allarch opendreambox-github systemd

SYSTEMD_SERVICE_${PN} = "showiframe-backdrop.service"
GITHUB_PROJECT = "bootlogo"

do_configure() {
}

do_install_append() {
	oe_runmake 'DESTDIR=${D}' install
    install -d ${D}${systemd_system_unitdir}
    install -m644 ${WORKDIR}/showiframe-backdrop.service ${D}${systemd_system_unitdir}
}

do_install_append_meson64() {
    install -d ${D}${sysconfdir}/u-boot.scr.d
    install -m 0644 ${WORKDIR}/bootlogo.scr ${D}${sysconfdir}/u-boot.scr.d
}

PACKAGES =+ "${PN}-u-boot"

FILES_${PN}-u-boot = "/boot/bootlogo.bmp ${sysconfdir}/u-boot.scr.d"

RDEPENDS_${PN} = "showiframe"
RDEPENDS_${PN}-u-boot = "flash-scripts"

RRECOMMENDS_${PN}_append_meson64 = " ${PN}-u-boot"

pkg_postinst_${PN}-u-boot() {
[ -n "$D" ] || update-autoexec
}
