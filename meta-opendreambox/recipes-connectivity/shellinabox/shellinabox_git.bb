SUMMARY = "publish command line shell through AJAX interface"
HOMEPAGE = "https://github.com/shellinabox/shellinabox"
LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://COPYING;md5=a193d25fdef283ddce530f6d67852fa5"
DEPENDS = "zlib"
SRCREV = "5c7fb5cde2d2a74775af040549bb5cb11aae6790"
PV = "2.20+git${SRCPV}"

SRC_URI = "git://github.com/shellinabox/shellinabox.git \
           file://shellinaboxd.service"

S = "${WORKDIR}/git"

inherit autotools-brokensep systemd

EXTRA_OECONF = "--disable-runtime-loading --disable-utmp"

PACKAGECONFIG ?= "${@bb.utils.contains('DISTRO_FEATURES', 'pam', 'pam', '', d)} ssl"
PACKAGECONFIG[pam] = "--enable-pam,--disable-pam,pam"
PACKAGECONFIG[ssl] = "--enable-ssl,--disable-ssl,openssl"

do_install_append() {
    install -d ${D}${systemd_system_unitdir}
    install -m644 ${WORKDIR}/shellinaboxd.service ${D}${systemd_system_unitdir}
}

SYSTEMD_SERVICE_${PN} = "shellinaboxd.service"
