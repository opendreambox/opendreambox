## Warning: unknown variable/routine "GITHUB_BRANCH = "master""
SUMMARY = "Pure Python JavaScript Translator/Interpreter"
HOMEPAGE = "https://github.com/PiotrDabkowski/Js2Py"
SECTION = "devel/python"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=faa744092d3fb3314632e815e7c3a560"
SRCREV = "05e77f0d4ffe91ef418a93860e666962cfd193b8"
PV = "1.6.6"

SRC_URI = "git://github.com/PiotrDabkowski/Js2Py.git;protocol=https"

S = "${WORKDIR}/git/"

inherit setuptools

RDEPENDS_${PN} = "python"

BBCLASSEXTEND = "native"
