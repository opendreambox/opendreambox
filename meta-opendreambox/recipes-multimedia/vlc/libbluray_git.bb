SUMMARY = "Library to access Blu-Ray disks"
SECTION = "libs/multimedia"
LICENSE = "LGPLv2.1+"
LIC_FILES_CHKSUM = "file://COPYING;md5=435ed639f84d4585d93824e7da3d85da"
SRCREV = "89e68a40ddc4a11d4538da2281ef1ac4260a8d6b"
PV = "0.2.2+git${SRCPV}"
PR = "r0"

SRC_URI = "git://git.videolan.org/${PN}.git;protocol=git"

S = "${WORKDIR}/git"

inherit autotools lib_package pkgconfig
