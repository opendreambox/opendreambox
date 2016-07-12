SUMMARY = "Screen grabber for Dreambox Set-Top-Boxes"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://LICENSE;md5=94d55d512a9ba36caa9b7df079bae19f"
DEPENDS = "jpeg libpng"
SRCREV = "${@opendreambox_srcrev('29963d0a838e0bbdb91d3e44bc65ff940631f5e5', d)}"

inherit autotools opendreambox-git pkgconfig
