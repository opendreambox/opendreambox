SUMMARY = "Voluptuous is a Python data validation library"
HOMEPAGE = "https://github.com/alecthomas/voluptuous"
SECTION = "devel/python"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://COPYING;md5=9855ba150f2edb00d8e7a41554896ffb"
SRCREV = "784d1e7c5eef90f31cbc313638c4ebbc44372301"
PV = "0.11.1"

SRC_URI = "git://github.com/alecthomas/voluptuous.git;protocol=https"

S = "${WORKDIR}/git/"

inherit setuptools

RDEPENDS_${PN} = "python"

BBCLASSEXTEND = "native"
