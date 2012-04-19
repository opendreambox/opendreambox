LIC_FILES_CHKSUM = "file://../LICENSE;md5=e943a2b66bda2bf828e561a3e6c7ecfc"

SRC_URI += "http://dreamboxupdate.com/download/snapshots/enigma2_${PV}_${PACKAGE_ARCH}.tar.bz2;name=${PACKAGE_ARCH}"

S = "${WORKDIR}/enigma2_${PV}_${PACKAGE_ARCH}"

do_compile() {
}
do_install() {
        cp -r usr ${D}
}

require enigma2-common.inc
