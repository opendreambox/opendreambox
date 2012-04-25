SUMMARY = "libdvdnav wrapper for dream multimedia stbs"
LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://LICENSE;md5=94d55d512a9ba36caa9b7df079bae19f"
DEPENDS = "libdvdnav"
SRCREV = "83fa990e8edae35098976e227b83191c0a53cd41"
PR = "r2"

inherit autotools pkgconfig schwerkraft-git

CFLAGS += "-DHARDWARE_SUPPORT_LPCM"
