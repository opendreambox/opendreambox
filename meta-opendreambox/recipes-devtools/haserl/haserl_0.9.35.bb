SUMMARY = "Html And Shell Embedded Runtime Language"
HOMEPAGE = "http://haserl.sourceforge.net/"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263"

SRC_URI = "${SOURCEFORGE_MIRROR}/${BPN}/${BP}.tar.gz"
SRC_URI[md5sum] = "918f0b4f6cec0b438c8b5c78f2989010"
SRC_URI[sha256sum] = "a1b633e80f3e2638e7f8f850786e95072cfd9877f88780092996fd6aaf7ae2da"

PACKAGECONFIG ?= "bashshell"
PACKAGECONFIG[bashshell] = "--enable-bashshell,--disable-bashshell"
PACKAGECONFIG[lua] = "--with-lua,without-lua,lua5.1"

inherit autotools pkgconfig
