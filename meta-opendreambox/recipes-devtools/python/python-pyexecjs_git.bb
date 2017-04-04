SUMMARY = "Run JavaScript code from Python."
HOMEPAGE = "https://github.com/doloopwhile/PyExecJS"
SECTION = "devel/python"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=70f9df77ea55ba7d1f19e18f62cf5bb6"
SRCREV = "2a4b56e31bd03c0b4cb47c0d52aecac6c038efb7"
PV = "1.4.0"

SRC_URI = "git://github.com/doloopwhile/PyExecJS.git;protocol=https"

S = "${WORKDIR}/git/"

inherit setuptools

RDEPENDS_${PN} = "python nodejs"

BBCLASSEXTEND = "native"
