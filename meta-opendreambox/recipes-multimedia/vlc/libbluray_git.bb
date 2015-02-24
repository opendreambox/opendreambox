SUMMARY = "Library to access Blu-Ray disks"
SECTION = "libs/multimedia"
LICENSE = "LGPLv2.1+"
LIC_FILES_CHKSUM = "file://COPYING;md5=435ed639f84d4585d93824e7da3d85da"
SRCREV = "64a48435eb3826e67bda39f03068e969806f6bc1"
PV = "0.7.0+git${SRCPV}"

SRC_URI = "git://git.videolan.org/${PN}.git"

S = "${WORKDIR}/git"

inherit autotools lib_package pkgconfig

PACKAGECONFIG ??= "fontconfig freetype libxml2"
PACKAGECONFIG[fontconfig] = "--with-freetype,--without-freetype,freetype"
PACKAGECONFIG[freetype] = "--with-fontconfig,--without-fontconfig,fontconfig"
PACKAGECONFIG[libxml2] = "--with-libxml2,--without-libxml2,libxml2"
