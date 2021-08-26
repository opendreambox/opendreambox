SUMMARY = "Contains some simple helper functions for calling fcntl.ioctl()"
HOMEPAGE = "https://github.com/olavmrk/python-ioctl"
SECTION = "devel/python"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=c89cfb68b1a0b82784ad4b8ddc058eba"
SRCREV = "1f090606fb5b68cd4cd98a3eb18fd4a571fc931c"
PV = "0.0.2+git${SRCPV}"
DEPENDS = "python-setuptools-scm-native"

SRC_URI = "git://github.com/olavmrk/python-ioctl"

S = "${WORKDIR}/git"

inherit setuptools

RDEPENDS_${PN} += "python-ctypes"
