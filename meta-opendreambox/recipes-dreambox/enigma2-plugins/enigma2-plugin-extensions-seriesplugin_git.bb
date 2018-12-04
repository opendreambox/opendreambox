SUMMARY = "Find and rename series"
DESCRIPTION = "Automatically add season and episode information to your timers and recordings"
HOMEPAGE = "http://www.i-have-a-dreambox.com/wbb2/thread.php?threadid=168016"
LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://src/LICENSE;md5=b234ee4d69f5fce4486a80fdaf4a4263"
DEPENDS = "gettext-native"
SRCREV = "26ee325972e6c462e6b3022a21e73cce906efaf3"
PV = "5.9.5+git${SRCPV}"

SRC_URI = "git://github.com/betonme/e2openplugin-SeriesPlugin.git"

S = "${WORKDIR}/git"

inherit autotools-brokensep

RDEPENDS_${PN} = " \
    python-difflib \
    python-json \
    python-re \
    python-xml \
    python-xmlrpc \
"

require enigma2-plugin.inc
