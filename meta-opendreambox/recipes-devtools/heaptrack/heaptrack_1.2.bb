SUMMARY = "A heap memory profiler for Linux"
HOMEPAGE = "https://github.com/KDE/heaptrack"
LICENSE = "LGPL-2.1"
LIC_FILES_CHKSUM = "file://COPYING;md5=4fbd65380cdd255951079008b364516c"
DEPENDS = "boost elfutils libunwind zlib"
SRCREV = "33da3a68d899facce613da1e01aed085f1dc10e8"

SRC_URI = "git://github.com/KDE/heaptrack.git;protocol=https;branch=1.2"

inherit cmake git-project

FILES_${PN} += "${libdir}/heaptrack/libheaptrack_*.so"

INSANE_SKIP_${PN} = "dev-so"
