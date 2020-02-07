SUMMARY = "Open implementation of the AACS specification"
SECTION = "libs/multimedia"
LICENSE = "LGPLv2.1+"
LIC_FILES_CHKSUM = "file://COPYING;md5=4b54a1fd55a448865a0b32d41598759d"
DEPENDS = "libgcrypt"
SRCREV = "21d4f50aa188dcdcf9a220ac1c0751f05f968722"
PV = "0.9.0+git${SRCPV}"

SRC_URI = "git://code.videolan.org/videolan/${BPN}.git;protocol=https \
           file://0001-configure.ac-Use-pkg-config-for-libgcrypt.patch"

S = "${WORKDIR}/git"

inherit autotools-brokensep lib_package pkgconfig
