DESCRIPTION = "open source C++ wrapper library for SQLite"
HOMEPAGE = "http://sqlitewrapper.kompex-online.com/"
LICENSE = "LGPLv3+"
LIC_FILES_CHKSUM = "file://src/KompexSQLiteDatabase.cpp;endline=17;md5=3561654b9655027ded0181c2c71bc090"

SRC_URI = "http://sqlitewrapper.kompex-online.com/counter/download.php?dl=KompexSQLiteWrapper-Source_${PV}.tar.gz \
           file://add_automake.patch"
SRC_URI[md5sum] = "8ad05024df94f3f18d6a5bd4b70e6c0e"
SRC_URI[sha256sum] = "a1ea90c5db1f56bae743e0187c0b151417890dc626fda63d85bf488a30acfda7"

S = "${WORKDIR}/KompexSQLiteWrapper-Source_${PV}"

inherit autotools pkgconfig
