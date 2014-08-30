SUMMARY = "Screen grabber for Dreambox Set-Top-Boxes"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://LICENSE;md5=94d55d512a9ba36caa9b7df079bae19f"
DEPENDS = "jpeg libpng"
SRCREV = "${@opendreambox_srcrev('6e1aef36fe1e88e9d3243f669866c2113a65089f', d)}"

inherit autotools pkgconfig schwerkraft-git
