SUMMARY = "libdvdnav wrapper for dream multimedia stbs"
LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://LICENSE;md5=94d55d512a9ba36caa9b7df079bae19f"
DEPENDS = "libdvdnav"
SRCREV = "${@opendreambox_srcrev('26c9268f5578cab0684d7647857a8d13ecf2946a',d)}"

inherit autotools opendreambox-git pkgconfig
