SUMMARY = "Python UPnP framework"
HOMEPAGE = "http://coherence.beebits.net/"
SECTION = "devel/python"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENCE;md5=3f7c147addd67ce1d53239c68a6b7022"
DEPENDS = "libxml2"
SRCREV = "0cfb375e9c70a74fea92571b7964d8562e59e832"
BASEPV = "0.6.11"
PV = "${BASEPV}+git${SRCPV}"

SRC_URI = "git://github.com/sreichholf/python-coherence.git;protocol=git;branch=develop"

S = "${WORKDIR}/git"

inherit setuptools

do_configure_prepend() {
        sed -e 's,from coherence import __version__$,__version__ = "${BASEPV}",' -i setup.py
}
do_install_append() {
        rm ${D}${bindir}/applet-coherence
        rm -r ${D}${PYTHON_SITEPACKAGES_DIR}/Coherence-${BASEPV}-*.egg-info
        rm -r ${D}${PYTHON_SITEPACKAGES_DIR}/coherence/test
}

PACKAGES =+ "${PN}-bin"

RDEPENDS_${PN} = "python-xmlrpc python-twisted-web"
RDEPENDS_${PN}-bin = "${PN} python-zopeinterface"

FILES_${PN}-bin = "${bindir} ${PYTHON_SITEPACKAGES_DIR}/misc/*.py"
