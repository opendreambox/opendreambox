DESCRIPTION = "A library for network address representation and manipulation"
HOMEPAGE = "https://github.com/drkjam/netaddr"
SECTION = "devel/python"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://LICENSE;md5=64c24df6c6be03cf388a97f707e8405e"

SRCNAME = "netaddr"

SRC_URI = "https://github.com/downloads/drkjam/${SRCNAME}/${SRCNAME}-${PV}.zip"
SRC_URI[md5sum] = "5ffc5ca81294cb76c0c89bc2bdd43912"
SRC_URI[sha256sum] = "c17969b5522a48fee018970b0aa8104b088ebb97eabf3e11935845caabbcf3a0"

S = "${WORKDIR}/${SRCNAME}-${PV}"

inherit distutils

RDEPENDS_${PN} = "python-pprint"
