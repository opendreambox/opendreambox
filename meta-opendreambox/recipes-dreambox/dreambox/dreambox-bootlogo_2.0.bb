SUMMARY = "Bootlogo support"
LICENSE = "CLOSED"

SRC_URI = "file://showiframe-backdrop.service \
           file://bootlogo.bmp.gz \
           file://bootlogo.scr"
SRC_URI[all.md5sum] = "42367f61500d75277384e3d826985328"
SRC_URI[all.sha256sum] = "1421a3ef8455af04f5b1717502458188d00d99114333476597580d9299aa73a8"

SYSTEMD_SERVICE_${PN} = "showiframe-backdrop.service"

inherit allarch opendreambox-precompiled-binary systemd

do_install_append() {
    install -d ${D}${systemd_system_unitdir}
    install -m644 ${WORKDIR}/showiframe-backdrop.service ${D}${systemd_system_unitdir}
}

do_install_append_meson64() {
    install -d ${D}/boot
    install -m 0644 ${WORKDIR}/bootlogo.bmp ${D}/boot
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
