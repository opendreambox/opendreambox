SUMMARY = "Python UPnP framework"
HOMEPAGE = "http://coherence.beebits.net/"
SECTION = "devel/python"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENCE;md5=3f7c147addd67ce1d53239c68a6b7022"
DEPENDS = "libxml2"
SRCREV = "${@opendreambox_srcrev('8daeb7cf9edda250e6e529c1988468f84501e95b', d)}"
PV = "0.7.1"
GITHUB_BRANCH = "develop"

inherit setuptools opendreambox-github

do_configure_prepend() {
        sed -e 's,from coherence import __version__$,__version__ = "${RECIPE_PV}",' -i setup.py
}
do_install_append() {
        rm ${D}${bindir}/applet-coherence
        rm -r ${D}${PYTHON_SITEPACKAGES_DIR}/Coherence-${RECIPE_PV}-*.egg-info
        rm -r ${D}${PYTHON_SITEPACKAGES_DIR}/coherence/test
}

PACKAGES =+ "${PN}-bin"

RDEPENDS_${PN} = "python-xmlrpc python-twisted-web"
RDEPENDS_${PN}-bin = "${PN} python-zopeinterface"

FILES_${PN}-bin = "${bindir} ${PYTHON_SITEPACKAGES_DIR}/misc/*.py"
