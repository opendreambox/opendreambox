SUMMARY = "Download videos from youtube.com or other video platforms"
HOMEPAGE = "http://github.com/google/google-api-python-client"
SECTION = "devel/python"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=94023d14f6b58272fd885e4e3f2f08b3"
RDEPENDS_${PN} = "python-httplib2 python-uritemplate python-oauth2client python-six"

SRCREV = "31c47b8b13195a04f1f8783e3cec74729d34bc5b"

SRC_URI = "git://github.com/google/google-api-python-client.git;protocol=git;branch=master"

S = "${WORKDIR}/git"

inherit setuptools

CLEANBROKEN = "1"
