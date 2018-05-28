SUMMARY = "https://github.com/supersaiyanmode/PyWebOSTV.git"
HOMEPAGE = "https://github.com/supersaiyanmode/PyWebOSTV"
SECTION = "devel/python"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=eafd4ca13a08e4eb1432058644f9b156"

DEPENDS = "libxml2"
RDEPENDS_${PN} = "python-requests python-future python-ws4py"

GITHUB_ORGANIZATION = "supersaiyanmode"
GITHUB_PROJECT = "PyWebOSTV"

SRCREV = "${@opendreambox_srcrev('dc5b13ddc217fabe7c8083cbfb01120a7cec30a6', d)}"

inherit setuptools opendreambox-github

