SUMMARY = "Download videos from youtube.com or other video platforms"
HOMEPAGE = "http://rg3.github.io/youtube-dl/"
SECTION = "devel/python"
LICENSE = "Unlicense"
LIC_FILES_CHKSUM = "file://LICENSE;md5=7246f848faa4e9c9fc0ea91122d6e680"
DEPENDS = "libxml2"
SRCREV = "94e08950e325c120be4f5be24eda9021cc222297"
PV = "2016.10.25+git${SRCPV}"

SRC_URI = "git://github.com/rg3/youtube-dl.git"

S = "${WORKDIR}/git"

inherit setuptools

do_install_append() {
    mv ${D}${datadir}/etc ${D}${sysconfdir}
}

RDEPENDS_${PN} = "python-unixadmin python-subprocess python-email python-argparse"

FILES_${PN} += "${sysconfdir}"
