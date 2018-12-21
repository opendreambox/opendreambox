SUMMARY = "create DVD-Video file system"
SECTION = "console/multimedia"
LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263"
DEPENDS = "bison-native freetype fribidi libpng libxml2 zlib"
SRCREV = "d926718e9aad9919fbd922ca1e0da8bc07cb67d7"
PV = "0.7.2+git${SRCPV}"

SRC_URI = "git://github.com/ldo/dvdauthor;protocol=https \
           file://0001-configure-use-pkg-config-to-detect-freetype2.patch"

S = "${WORKDIR}/git"

inherit autotools pkgconfig

AUTOTOOLS_AUXDIR = "${S}/autotools"
EXTRA_OECONF = "--enable-default-video-format=PAL"
EXTRA_OEMAKE = "-C src"

PACKAGECONFIG ??= "dvdunauthor"
PACKAGECONFIG[dvdunauthor] = "--enable-dvdunauthor,--disable-dvdunauthor,libdvdread"
PACKAGECONFIG[imagemagick] = "--with-imagemagick,--without-imagemagick,imagemagick"

do_configure_prepend() {
	mkdir -p ${AUTOTOOLS_AUXDIR}
	cp ${STAGING_DATADIR_NATIVE}/gettext/config.rpath ${AUTOTOOLS_AUXDIR}/
}

PARALLEL_MAKE = ""
