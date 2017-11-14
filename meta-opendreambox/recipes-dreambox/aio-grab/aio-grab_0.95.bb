SUMMARY = "Screen grabber for Dreambox Set-Top-Boxes"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://LICENSE;md5=94d55d512a9ba36caa9b7df079bae19f"
DEPENDS = "jpeg libpng"
SRCREV = "${@opendreambox_srcrev('bc00c80ac3b84509df19a9be03887ffefcaeef2d', d)}"

inherit autotools opendreambox-git pkgconfig
