SUMMARY = "satip client using vtuner"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://LICENSE;md5=2c1c00f9d3ed9e24fa69b932b7e7aff2"

GITHUB_ORGANIZATION = "oe-alliance"
GITHUB_BRANCH = "next"
SRC_URI += " \
    file://satip-client.service \
    file://0001-add-some-pseudo-snr-calculation.patch \
    file://0002-enable-proper-lock-handling.patch \
"

SRCREV = "2dca499073b1f666cb340ff4c83cce1a0a9d988c"

inherit autotools pkgconfig opendreambox-github systemd

SYSTEMD_SERVICE_${PN} = "satip-client.service"

do_install_append() {
    install -d ${D}${systemd_unitdir}/system
    install -m 0644 ${WORKDIR}/satip-client.service ${D}${systemd_unitdir}/system/
}

CONFFILES_${PN} = "${sysconfdir}/vtuner.conf"

EXTRA_OECONF = " \
    --with-boxtype=${MACHINE} \
"
