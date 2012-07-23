SUMMARY = "open source C++ wrapper library for SQLite"
HOMEPAGE = "http://sqlitewrapper.kompex-online.com/"
LICENSE = "LGPLv3+"
LIC_FILES_CHKSUM = "file://src/KompexSQLiteDatabase.cpp;endline=17;md5=0f7c12fa150857cbf034e1a7c8abd5fc"
PR = "r1"

SRC_URI = "http://sqlitewrapper.kompex-online.com/counter/download.php?dl=KompexSQLiteWrapper-Source_${PV}.tar.gz \
           file://add_automake.patch \
           file://no-exceptions.patch"

SRC_URI[md5sum] = "28548f43670625f1477825b7a1685b4c"
SRC_URI[sha256sum] = "6d5a71dd8d39297fbf8b154bcc2df223dfd75e1eaaca1fcdd0dbc5d2bc3c8524"

S = "${WORKDIR}/KompexSQLiteWrapper-Source_${PV}"

inherit autotools pkgconfig
