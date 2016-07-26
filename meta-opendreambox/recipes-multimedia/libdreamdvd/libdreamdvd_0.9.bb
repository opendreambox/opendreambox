SUMMARY = "libdvdnav wrapper for dream multimedia stbs"
LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://LICENSE;md5=94d55d512a9ba36caa9b7df079bae19f"
DEPENDS = "libdvdnav"
SRCREV = "${@opendreambox_srcrev('3a3ae0faa3476f8abaf867c8a1c4a7d6869d3d64',d)}"

inherit autotools opendreambox-git pkgconfig
