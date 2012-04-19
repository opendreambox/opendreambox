DESCRIPTION = "This package provides dbox2/dreambox compatible header files for the API to the drivers."
LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://dbox/avs_core.h;beginline=1;endline=21;md5=b2ab401756a0768647ae13acb2e325ab"

SRC_URI = "http://sources.dreamboxupdate.com/snapshots/include2.tar.gz"
SRC_URI[md5sum] = "9d236095a88d7ce9f3bf0503ee5237d6"
SRC_URI[sha256sum] = "739bc35bccdb1e4c6e14b77ab86808354eb6fd75434d3bd6236f3b3346805e02"

S = "${WORKDIR}/include"

# avs_core.h and saa7126_core.h are obsolete, but
# libtuxtxt currently doesn't compile without them.
INPUT_FILES = " \
	dbox/fp.h \
	dbox/lcd-ks0713.h \
	dbox/avs_core.h \
	dbox/saa7126_core.h \
"

do_install() {
	install -d ${D}${includedir}/dbox
	for f in ${INPUT_FILES}; do
		install -m 0644 $f ${D}${includedir}/$f
	done
}
