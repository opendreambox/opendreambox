DESCRIPTION = "libdvdnav wrapper for dream multimedia stbs"
LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://LICENSE;md5=94d55d512a9ba36caa9b7df079bae19f"
DEPENDS = "libdvdnav"
SRCREV = "83fa990e8edae35098976e227b83191c0a53cd41"

inherit autotools pkgconfig schwerkraft-git

PACKAGE_ARCH = "${MACHINE_ARCH}"

CFLAGS += "${@base_contains('DREAMBOX_FEATURES', 'lpcm', '-DHARDWARE_SUPPORT_LPCM', '', d)}"
