SUMMARY = "EMC is an enhanced movielist replacement"
HOMEPAGE = "http://www.i-have-a-dreambox.com/wbb2/thread.php?threadid=156282"
LICENSE = "GPLv3+"
LIC_FILES_CHKSUM = "file://src/EnhancedMovieCenter.py;beginline=3;endline=20;md5=450164fbb85f5600d7527e78a47b314c"
DEPENDS = "gettext-native"
SRCREV = "8d81d42936bfd4fdff6878db75ed1badd0fbe5be"
PE = "1"
PV = "20210724+git${SRCPV}"

SRC_URI = " \
    git://github.com/betonme/e2openplugin-EnhancedMovieCenter.git \
    file://plugin_enhancedmoviecenter.xml \
"

S = "${WORKDIR}/git"

inherit autotools-brokensep

CONFFILES_${PN} = "\
    ${sysconfdir}/enigma2/emc-hide.cfg \
    ${sysconfdir}/enigma2/emc-noscan.cfg \
    ${sysconfdir}/enigma2/emc-permsort.cfg \
    ${sysconfdir}/enigma2/emc-topdir.cfg \
"

RDEPENDS_${PN} = " \
    python-json \
    python-shell \
    python-twisted-web \
    python-mutagen \
    python-requests \
"

do_install_append() {
    install -d ${D}${datadir}/meta
    install -m644 ${WORKDIR}/plugin_enhancedmoviecenter.xml ${D}${datadir}/meta/plugin_enhancedmoviecenter.xml
}

require enigma2-plugin.inc
