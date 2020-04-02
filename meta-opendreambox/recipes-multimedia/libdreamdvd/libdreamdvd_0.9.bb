SUMMARY = "libdvdnav wrapper for dream multimedia stbs"
LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://LICENSE;md5=94d55d512a9ba36caa9b7df079bae19f"
DEPENDS = "libdvdnav"
SRCREV = "${@opendreambox_srcrev('9ab5f17a943bc53e6c5f29a2940e82ecd50a496d',d)}"

inherit autotools opendreambox-git pkgconfig
