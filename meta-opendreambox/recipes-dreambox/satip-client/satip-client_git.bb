SUMMARY = "satip client using vtuner"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://LICENSE;md5=2c1c00f9d3ed9e24fa69b932b7e7aff2"

GITHUB_BRANCH = "next"
SRC_URI += " \
    file://satip-client.service \
    file://vtuner.conf \
"

SRCREV = "14b348053af339b2717a69fc6b6520c3e0fa72ed"

inherit autotools pkgconfig opendreambox-github systemd

SYSTEMD_SERVICE_${PN} = "satip-client.service"

do_install_append() {
    install -d ${D}${systemd_unitdir}/system
    install -m 0644 ${WORKDIR}/satip-client.service ${D}${systemd_unitdir}/system/
    install -d ${D}${datadir}/satip-client
    install -m 0644 ${WORKDIR}/vtuner.conf ${D}${datadir}/satip-client/vtuner.example.conf
}

pkg_postinst_${PN} () {
if [ ! -e "${sysconfdir}/vtuner.conf" ]; then
	cp ${datadir}/satip-client/vtuner.example.conf ${sysconfdir}/vtuner.conf
fi
}

EXTRA_OECONF = " \
    --with-boxtype=${MACHINE} \
"

