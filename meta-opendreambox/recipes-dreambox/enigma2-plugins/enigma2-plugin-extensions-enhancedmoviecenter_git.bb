SUMMARY = "EMC is an enhanced movielist replacement"
HOMEPAGE = "http://www.i-have-a-dreambox.com/wbb2/thread.php?threadid=156282"
LICENSE = "GPLv3+"
LIC_FILES_CHKSUM = "file://src/EnhancedMovieCenter.py;beginline=3;endline=20;md5=450164fbb85f5600d7527e78a47b314c"
DEPENDS = "gettext-native"
SRCREV = "4a2b4c2bc0540b0a89a253f2eedfe09e2c4ab5ae"
PE = "1"
PV = "20181108+git${SRCPV}"

SRC_URI = "git://github.com/betonme/e2openplugin-EnhancedMovieCenter.git"

S = "${WORKDIR}/git"

inherit autotools-brokensep

RDEPENDS_${PN} = " \
    python-json \
    python-shell \
    python-twisted-web \
"

require enigma2-plugin.inc
