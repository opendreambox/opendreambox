SUMMARY = "Find and rename series"
DESCRIPTION = "Automatically add season and episode information to your timers and recordings"
HOMEPAGE = "http://www.i-have-a-dreambox.com/wbb2/thread.php?threadid=168016"
LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://src/LICENSE;md5=b234ee4d69f5fce4486a80fdaf4a4263"
DEPENDS = "gettext-native"
SRCREV = "ab700658ec6fb046734346c26b07e54bccb92510"
PV = "5.9.1+git${SRCPV}"

SRC_URI = "git://github.com/betonme/e2openplugin-SeriesPlugin.git"

S = "${WORKDIR}/git"

inherit autotools-brokensep pythonnative

PACKAGES += "${PN}-meta"

RDEPENDS_${PN} = " \
    enigma2 \
    python-difflib \
    python-json \
    python-re \
    python-xml \
    python-xmlrpc \
"

FILES_${PN} += "${libdir}/enigma2/python"
FILES_${PN}-meta = "${datadir}/meta"
