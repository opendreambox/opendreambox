SUMMARY = "pugixml is a C++ XML processing library"
HOMEPAGE = "https://pugixml.org"
SECTION = "libs"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://readme.txt;md5=60de230cb0033dcc89dd409e289a827d"

SRC_URI = "https://github.com/zeux/pugixml/releases/download/v${PV}/pugixml-${PV}.tar.gz"

SRC_URI[md5sum] = "f97237e9908201c6d8536210747b66af"
SRC_URI[sha256sum] = "55f399fbb470942410d348584dc953bcaec926415d3462f471ef350f29b5870a"

inherit cmake pkgconfig

S = "${WORKDIR}/pugixml-${PV}"

EXTRA_OECMAKE += "-DBUILD_SHARED_LIBS=ON \
                  -DCMAKE_BUILD_TYPE=Release \
                  "

FILES_${PN}-dev += "${libdir}/cmake"
