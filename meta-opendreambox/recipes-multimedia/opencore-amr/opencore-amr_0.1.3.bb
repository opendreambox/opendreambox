SUMMARY = "Adaptive Multi Rate speech codecs"
SECTION = "libs/multimedia"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=dd2c2486aca02190153cf399e508c7e7"
PR = "r0"

SRC_URI = "${SOURCEFORGE_MIRROR}/${BPN}/${BP}.tar.gz"
SRC_URI[md5sum] = "09d2c5dfb43a9f6e9fec8b1ae678e725"
SRC_URI[sha256sum] = "106bf811c1f36444d7671d8fd2589f8b2e0cca58a2c764da62ffc4a070595385"

inherit autotools pkgconfig

PACKAGES =+ "libopencore-amrnb libopencore-amrwb"

RDEPENDS_${PN} = "libopencore-amrnb libopencore-amrwb"

FILES_libopencore-amrnb = "${libdir}/libopencore-amrnb${SOLIBS}"
FILES_libopencore-amrwb = "${libdir}/libopencore-amrwb${SOLIBS}"

ALLOW_EMPTY_${PN} = "1"
