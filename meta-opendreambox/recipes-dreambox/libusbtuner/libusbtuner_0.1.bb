SUMMARY = "Preload lib for DreamOS USB DVB Frontend/Tuner integration"
DEPENDS = "libdlsym"
SRCREV = "${@opendreambox_srcrev('94b298d81f53a892e3dbbc215365e5e6a3f0a361', d)}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=8f242b441da515e30c7b07f2cc6f4d5c"

inherit autotools opendreambox-git pkgconfig

FILES_${PN} += "${libdir}/lib*${SOLIBSDEV}"
FILES_${PN}-dev = "${libdir}/*.la"

DEBIAN_NOAUTONAME_${PN} = "1"
