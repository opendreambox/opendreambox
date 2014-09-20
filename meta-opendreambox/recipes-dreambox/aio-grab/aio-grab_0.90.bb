SUMMARY = "Screen grabber for Dreambox Set-Top-Boxes"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://LICENSE;md5=94d55d512a9ba36caa9b7df079bae19f"
DEPENDS = "jpeg libpng"
SRCREV = "${@opendreambox_srcrev('7c165e47bf1e7325a7c596064b2afcee40ecfd14', d)}"

inherit autotools pkgconfig schwerkraft-git
