DESCRIPTION = "A set of tools to help you generate DVD files to be played back on a standalone DVD player"
SECTION = "console/multimedia"
LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://COPYING;md5=94d55d512a9ba36caa9b7df079bae19f"
DEPENDS = "freetype libdvdread libfribidi libpng libxml2 zlib"

SRC_URI = "${SOURCEFORGE_MIRROR}/${PN}/${P}.tar.gz"
SRC_URI[md5sum] = "ded5373800ac6448ff044606f5047550"
SRC_URI[sha256sum] = "0e21c2d9c09f7e347c4c9bd7b691455f524ec2e91bcafc18b84d7b7fb3a9cb26"

S = "${WORKDIR}/${PN}"

inherit autotools
