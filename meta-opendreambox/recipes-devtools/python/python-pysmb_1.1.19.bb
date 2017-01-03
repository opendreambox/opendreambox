SUMMARY = "SMB/CIFS library to support file sharing between Windows and Linux machines"
HOMEPAGE = "https://miketeo.net/projects/pysmb"
SECTION = "devel/python"
LICENSE = "Zlib"
LIC_FILES_CHKSUM = "file://LICENSE;md5=21c760b839b67e25d55d6dabc6abee53"

SRC_URI[md5sum] = "e6f9ce0032db528aae060f7019bd409c"
SRC_URI[sha256sum] = "fa4e6b4a4f2afbfbd71e9179c491f8c77bc2ad19e0bc866d7c6cbfa9ae272602"

inherit pypi setuptools

RDEPENDS_${PN} = "python-pyasn1 python-twisted-core"
