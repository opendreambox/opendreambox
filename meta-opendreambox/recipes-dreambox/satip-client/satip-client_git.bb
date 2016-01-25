SUMMARY = "satip client using vtuner"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://LICENSE;md5=2c1c00f9d3ed9e24fa69b932b7e7aff2"

GITHUB_ORGANIZATION = "oe-alliance"
GITHUB_BRANCH = "next"
SRC_URI += " \
    file://satip-client.service \
    file://vtuner.conf \
"

SRCREV = "1a00c73d0da9f9243d74349d8f66f30efedc9eda"

inherit autotools pkgconfig opendreambox-github systemd

SYSTEMD_SERVICE_${PN} = "satip-client.service"

do_install_append() {
    install -d ${D}${systemd_unitdir}/system
    install -m 0644 ${WORKDIR}/satip-client.service ${D}${systemd_unitdir}/system/
    install -d ${D}${sysconfdir}
    install -m 0644 ${WORKDIR}/vtuner.conf ${D}${sysconfdir}
}

EXTRA_OECONF = " \
    --with-boxtype=${MACHINE} \
"
