SUMMARY = "Html And Shell Embedded Runtime Language"
HOMEPAGE = "http://haserl.sourceforge.net/"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263"

SRC_URI = "${SOURCEFORGE_MIRROR}/${BPN}/${BP}.tar.gz"
SRC_URI[md5sum] = "a9decddb508944d56f71dd2f821e2ec5"
SRC_URI[sha256sum] = "9a65b14dc721643fc5b85c79117cb6d824bd3683b246744137bb5d978df7621b"

PACKAGECONFIG ?= "bashshell"
PACKAGECONFIG[bashshell] = "--enable-bashshell,--disable-bashshell"
PACKAGECONFIG[lua] = "--with-lua,without-lua,lua5.1"

inherit autotools pkgconfig
