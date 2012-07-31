DESCRIPTION = "Control Gembird SIS-PM programmable power outlet strips"
AUTHOR = "Mondrian Nuessle <nuessle@uni-mannheim.de>"
HOMEPAGE = "http://sispmctl.sourceforge.net/"
LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://COPYING;md5=94d55d512a9ba36caa9b7df079bae19f"
DEPENDS = "libusb-compat"

SRC_URI = "http://downloads.sourceforge.net/${PN}/${P}.tar.gz \
           file://libusb-use-pkgconfig.patch"
SRC_URI[md5sum] = "24693cae30d77c957f34cfb2c8159661"
SRC_URI[sha256sum] = "e9a99cc81ef0a93f3484e5093efd14d93cc967221fcd22c151f0bea32eb91da7"

inherit autotools

EXTRA_OECONF = "--enable-webless"
