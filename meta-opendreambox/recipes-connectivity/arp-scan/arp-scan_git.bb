SUMMARY = "arp scanning and fingerprinting tool"
HOMEPAGE = "http://www.nta-monitor.com/wiki/"
LICENSE = "GPLv3+"
LIC_FILES_CHKSUM = "file://COPYING;md5=d32239bcb673463ab874e80d47fae504"
DEPENDS = "libpcap"
SRCREV = "7d710d916c59905c6137cc7090193db184e3da68"
PV = "1.9+git${SRCPV}"

SRC_URI = "git://github.com/royhills/arp-scan.git"

S = "${WORKDIR}/git"

inherit autotools

PACKAGES =+ "${PN}-data ${PN}-perl"

RDEPENDS_${PN}-perl = "perl"

RSUGGESTS_${PN} = "${PN}-data ${PN}-perl"

FILES_${PN}-data = "${datadir}/${BPN}/*.txt"
FILES_${PN}-perl = "${bindir}/arp-fingerprint \
                    ${bindir}/get-iab \
                    ${bindir}/get-oui"
