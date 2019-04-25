SUMMARY = "EMC is an enhanced movielist replacement"
HOMEPAGE = "http://www.i-have-a-dreambox.com/wbb2/thread.php?threadid=156282"
LICENSE = "GPLv3+"
LIC_FILES_CHKSUM = "file://src/EnhancedMovieCenter.py;beginline=3;endline=20;md5=450164fbb85f5600d7527e78a47b314c"
DEPENDS = "gettext-native"
SRCREV = "0a00fc8032b59f9da9a72d2afd0efb20daed9e63"
PE = "1"
PV = "20190425+git${SRCPV}"

SRC_URI = "git://github.com/betonme/e2openplugin-EnhancedMovieCenter.git"

S = "${WORKDIR}/git"

inherit autotools-brokensep

RDEPENDS_${PN} = " \
    python-json \
    python-shell \
    python-twisted-web \
"

require enigma2-plugin.inc
