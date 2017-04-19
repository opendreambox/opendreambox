SUMMARY = "EMC is an enhanced movielist replacement"
HOMEPAGE = "http://www.i-have-a-dreambox.com/wbb2/thread.php?threadid=156282"
LICENSE = "GPLv3+"
LIC_FILES_CHKSUM = "file://src/EnhancedMovieCenter.py;beginline=3;endline=20;md5=450164fbb85f5600d7527e78a47b314c"
DEPENDS = "gettext-native"
SRCREV = "4b081d65c5424a7b5ff1de3c127f9d93fa095897"
PV = "3.7.4+git${SRCPV}"

SRC_URI = "git://github.com/betonme/e2openplugin-EnhancedMovieCenter.git"

S = "${WORKDIR}/git"

inherit autotools-brokensep

RDEPENDS_${PN} = " \
    python-json \
    python-shell \
    python-twisted-web \
"

require enigma2-plugin.inc
