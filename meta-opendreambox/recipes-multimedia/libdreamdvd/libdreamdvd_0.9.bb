SUMMARY = "libdvdnav wrapper for dream multimedia stbs"
LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://LICENSE;md5=94d55d512a9ba36caa9b7df079bae19f"
DEPENDS = "libdvdnav"
SRCREV = "${@opendreambox_srcrev('4b626fcc10a8e13aa00f1643ea6335f5aaa8c6c7',d)}"

inherit autotools opendreambox-git pkgconfig
