LIC_FILES_CHKSUM = "file://../LICENSE;md5=e943a2b66bda2bf828e561a3e6c7ecfc"
DEPENDS += "ethtool freetype gstreamer libdreamdvd libdvbsi++ libfribidi libpng libxml2 libxmlccwrap openssl python-wifi"

SRC_URI += "http://dreamboxupdate.com/download/${DISTRO}/${DISTRO_VERSION}/${PN}/${PN}_${PV}_${PACKAGE_ARCH}.tar.bz2;name=${PACKAGE_ARCH}"

S = "${WORKDIR}/${PN}_${PV}_${PACKAGE_ARCH}"

do_compile() {
}
do_install() {
        cp -r usr ${D}
}

require enigma2-common.inc

INHIBIT_PACKAGE_STRIP = "1"
