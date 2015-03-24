SUMMARY = "Screen grabber for Dreambox Set-Top-Boxes"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://LICENSE;md5=94d55d512a9ba36caa9b7df079bae19f"
DEPENDS = "jpeg libpng"
SRCREV = "${@opendreambox_srcrev('334baf25f5128213ebc7ba2d28d11d9e13bf0be4', d)}"

inherit autotools opendreambox-git pkgconfig
