DESCRIPTION = "QXmpp is an xmpp client library based on Qt & C++"
HOMEPAGE = "https://code.google.com/p/qxmpp/"
SECTION = "libs"
LICENSE = "LGPLv2.1+"
LIC_FILES_CHKSUM = "file://LICENSE.LGPL;md5=fbc093901857fcd118f065f900982c24"

SRC_URI = "https://qxmpp.googlecode.com/files/qxmpp-${PV}.tar.gz"

S = "${WORKDIR}/qxmpp-${PV}"

inherit lib_package pkgconfig

EXTRA_QMAKEVARS_PRE += "PREFIX=${prefix} QXMPP_LIBRARY_TYPE=lib"

do_compile() {
        oe_runmake sub-src-all-ordered
}
do_install() {
        oe_runmake sub-src-install_subtargets-ordered INSTALL_ROOT=${D}
}
