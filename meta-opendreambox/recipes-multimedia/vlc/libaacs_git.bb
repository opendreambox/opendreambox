SUMMARY = "Open implementation of the AACS specification"
SECTION = "libs/multimedia"
LICENSE = "LGPLv2.1+"
LIC_FILES_CHKSUM = "file://COPYING;md5=4b54a1fd55a448865a0b32d41598759d"
DEPENDS = "libgcrypt"
SRCREV = "ffad3228fef99bd7248b3de41258f74263f27a16"
PV = "0.8.0"

SRC_URI = "git://git.videolan.org/${BPN}.git"

S = "${WORKDIR}/git"

inherit autotools lib_package pkgconfig
