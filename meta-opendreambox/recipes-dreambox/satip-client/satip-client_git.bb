SUMMARY = "satip client using vtuner"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://LICENSE;md5=2c1c00f9d3ed9e24fa69b932b7e7aff2"

SRC_URI = " \
    git://github.com/oe-alliance/satip-client.git;protocol=git;branch=next \
    file://satip-client.service \
    file://vtuner.conf \
"

SRCREV = "f191d63f98f587a57424940f55fd3ffe8765c6db"

S = "${WORKDIR}/git"

inherit autotools pkgconfig git-project systemd

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
