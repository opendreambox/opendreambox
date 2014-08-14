DESCRIPTION = "ASN.1 types and codecs"
HOMEPAGE = "http://sourceforge.net/projects/pyasn1/"
SECTION = "devel/python"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://LICENSE;md5=6ccc3f3f25785e9d645699e5d7433942"

SRC_URI = "http://pypi.python.org/packages/source/p/pyasn1/pyasn1-${PV}.tar.gz"
SRC_URI[md5sum] = "e1851ac1123c50f134cc29420fd5e0bd"
SRC_URI[sha256sum] = "a7c51782cea4d823454915ad46a580fe53b9adfe6514560d4b9cb590e002be35"

S = "${WORKDIR}/pyasn1-${PV}"

inherit setuptools
