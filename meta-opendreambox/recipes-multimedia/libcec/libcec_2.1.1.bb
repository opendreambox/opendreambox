SUMMARY = "USB CEC Adaptor communication Library"
HOMEPAGE = "http://libcec.pulse-eight.com/"
LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://COPYING;md5=5e8e16396992369f73f3d28875f846da"
DEPENDS = "udev"
SRCREV = "605d913ae656ef9707a7f9cbca41f78d180d79dc"
PR = "r2"

SRC_URI = "git://github.com/Pulse-Eight/libcec.git"

S = "${WORKDIR}/git"

inherit autotools lib_package pkgconfig

RDEPENDS_${PN}-bin = "${PN} (= ${EXTENDPKGV})"

RRECOMMENDS_${PN} = "kernel-module-cdc-acm"

PKG_${PN}-bin = "cec-utils"
