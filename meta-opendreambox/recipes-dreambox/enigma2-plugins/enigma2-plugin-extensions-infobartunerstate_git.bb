SUMMARY = "Show the tuner state as infobar popup"
HOMEPAGE = "https://github.com/betonme/e2openplugin-InfoBarTunerState"
LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://src/LICENSE;md5=b234ee4d69f5fce4486a80fdaf4a4263"
DEPENDS = "gettext-native"
SRCREV = "e16131f8580beb579486ac906b12959dd8444280"
PE = "1"
PV = "3.2.3+git${SRCPV}"

SRC_URI = "git://github.com/betonme/e2openplugin-InfoBarTunerState.git"

S = "${WORKDIR}/git"

inherit autotools-brokensep pythonnative

PACKAGES += "${PN}-meta"

RDEPENDS_${PN} = " \
    enigma2 \
    enigma2-plugin-extensions-webinterface \
    python-re \
    python-shell \
"

FILES_${PN} += "${libdir}/enigma2/python"
FILES_${PN}-meta = "${datadir}/meta"
