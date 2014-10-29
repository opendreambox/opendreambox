SUMMARY = "SMB/CIFS library to support file sharing between Windows and Linux machines"
HOMEPAGE = "https://miketeo.net/projects/pysmb"
SECTION = "devel/python"
LICENSE = "Zlib"
LIC_FILES_CHKSUM = "file://LICENSE;md5=9f4c6f48c17faa648296179379cf9e8b"
SRCREV = "e86684e38ecdd779cab34d8eec38ec680acaabec"
PV = "1.1.13+git${SRCPV}"

SRC_URI = "git://github.com/miketeo/pysmb.git"

S = "${WORKDIR}/git"

inherit setuptools

RDEPENDS_${PN} = "python-pyasn1"
