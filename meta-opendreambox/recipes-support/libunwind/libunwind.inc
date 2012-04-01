DESCRIPTION = "a portable and efficient C programming interface (API) to determine the call-chain of a program"
HOMEPAGE = "http://www.nongnu.org/libunwind"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://COPYING;md5=2d80c8ed4062b8339b715f90fa68cc9f"
INC_PR = "r1"

SRC_URI = "http://download.savannah.nongnu.org/releases/${BPN}/${BPN}-${PV}.tar.gz;name=archive"

S = "${WORKDIR}/${PN}-${PV}"

inherit autotools

EXTRA_OECONF_arm = "--enable-debug-frame"

BBCLASSEXTEND = "native"
