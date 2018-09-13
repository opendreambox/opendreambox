SUMMARY = "Download videos from youtube.com or other video platforms"
HOMEPAGE = "http://rg3.github.io/youtube-dl/"
SECTION = "devel/python"
LICENSE = "Unlicense"
LIC_FILES_CHKSUM = "file://LICENSE;md5=7246f848faa4e9c9fc0ea91122d6e680"
DEPENDS = "libxml2"
SRCREV = "8476b4fd91ce71c052a3bdea9e010e5196331606"
PV = "2018.09.10+git${SRCPV}"

SRC_URI = "git://github.com/rg3/youtube-dl.git"

S = "${WORKDIR}/git"

inherit setuptools

EXTRA_OEMAKE = "PYTHON=${PYTHON}"

do_compile_prepend() {
    oe_runmake lazy-extractors youtube-dl.bash-completion
}

do_install_append() {
    mv ${D}${datadir}/etc ${D}${sysconfdir}
    install -m 0755 -d ${D}${sysconfdir}/bash_completion.d
    install -m 0644 youtube-dl.bash-completion ${D}${sysconfdir}/bash_completion.d
}

RDEPENDS_${PN} = "python-unixadmin python-subprocess python-email python-argparse python-json"

FILES_${PN} += "${sysconfdir}"
