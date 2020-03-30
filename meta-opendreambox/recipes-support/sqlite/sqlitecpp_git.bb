SUMMARY = "smart and easy to use C++ SQLite3 wrapper"
HOMEPAGE = "https://srombauts.github.io/SQLiteCpp"
SECTION = "libs"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=a6abb8f9ddcf3b84c6995c2de97a2f1c"
DEPENDS = "sqlite3"
SRCREV = "01cf6f2d2adf2a7b71a420f2c91446364a9ada1e"
PV = "3.0.0+git${SRCPV}"

SRC_URI = "git://github.com/SRombauts/SQLiteCpp.git;protocol=https"

S = "${WORKDIR}/git"

inherit cmake

EXTRA_OECMAKE = "-DSQLITECPP_INTERNAL_SQLITE=off"
