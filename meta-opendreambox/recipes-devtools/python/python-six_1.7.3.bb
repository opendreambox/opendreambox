DESCRIPTION = "Python 2 and 3 compatibility utilities"
HOMEPAGE = "http://pypi.python.org/pypi/six/"
SECTION = "devel/python"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=530f34047c21ad45b3199946dd90bea5"

PR = "r1"
SRCNAME = "six"

SRC_URI = "https://pypi.python.org/packages/source/s/${SRCNAME}/${SRCNAME}-${PV}.tar.gz \
"

SRC_URI[md5sum] = "784c6e5541c3c4952de9c0a966a0a80b"
SRC_URI[sha256sum] = "7a842c9f882c0b2ab1064d567bb9fff6a21c9efbc3d9992083ad6193787ed393"

S = "${WORKDIR}/${SRCNAME}-${PV}"

inherit setuptools
