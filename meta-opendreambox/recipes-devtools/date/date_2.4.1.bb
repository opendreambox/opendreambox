SUMMARY = ""date.h" is a header-only library which builds upon <chrono>. It adds some new duration types, and new time_point types."
HOMEPAGE = "https://github.com/HowardHinnant/date"
SECTION = "libs"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=b5d973344b3c7bbf7535f0e6e002d017"

SRC_URI = "https://github.com/HowardHinnant/date/archive/v${PV}.tar.gz"

SRC_URI[md5sum] = "54d9dd9d5ac32214d3cbe8cc80bbccf2"
SRC_URI[sha256sum] = "98907d243397483bd7ad889bf6c66746db0d7d2a39cc9aacc041834c40b65b98"

inherit cmake

EXTRA_OECMAKE += "-DCMAKE_CXX_STANDARD=14"

S = "${WORKDIR}/date-${PV}"

FILES_${PN}-dev += "${libdir}/cmake"