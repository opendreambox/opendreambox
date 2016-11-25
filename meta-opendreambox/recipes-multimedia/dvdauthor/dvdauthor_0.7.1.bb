SUMMARY = "create DVD-Video file system"
SECTION = "console/multimedia"
LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://COPYING;md5=94d55d512a9ba36caa9b7df079bae19f"
DEPENDS = "freetype imagemagick libdvdread libfribidi libpng libxml2 zlib"

SRC_URI = "${SOURCEFORGE_MIRROR}/${PN}/${P}.tar.gz \
           file://0001-GraphicsMagick-CFLAGS-detection.patch \
           file://0002-Get-it-to-build-with-modern-GNU-Autotools-and-ImageM.patch \
           file://0003-configure-use-pkg-config-to-detect-freetype2.patch \
           file://0004-configure-use-pkg-config-to-detect-imagemagick.patch"
SRC_URI[md5sum] = "2694a5a3ef460106ea3caf0f7f60ff80"
SRC_URI[sha256sum] = "501fb11b09c6eb9c5a229dcb400bd81e408cc78d34eab6749970685023c51fe9"

S = "${WORKDIR}/${PN}"

inherit autotools gettext pkgconfig

PARALLEL_MAKE = ""
