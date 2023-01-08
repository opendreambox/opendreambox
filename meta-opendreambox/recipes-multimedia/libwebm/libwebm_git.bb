SUMMARY = "Parse WebM media files"
HOMEPAGE = "https://www.webmproject.org"
SECTION = "libs"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://LICENSE.TXT;md5=6e8dee932c26f2dab503abf70c96d8bb"
SRCREV = "5be44a2df762ab1e9b4b3ac31c00f08f920cfcf5"

SRC_URI = "git://chromium.googlesource.com/webm/libwebm;branch=main;protocol=https \
	file://0001-add-fPIC-for-shared-lib.patch"

inherit cmake pkgconfig
S = "${WORKDIR}/git"

EXTRA_OECMAKE += "-DBUILD_SHARED_LIBS=ON \
		-DENABLE_WEBM_PARSER=ON \
		-DCMAKE_BUILD_TYPE=Release \
		"

SOLIBS = ".so"
FILES_SOLIBSDEV = ""

do_install() {
	install -d ${D}${libdir}
	install ${B}/libwebm.so ${D}${libdir}
	install -d ${D}{includedir}webm
	cp -r ${S}/webm_parser/include ${D}${includedir}
}
