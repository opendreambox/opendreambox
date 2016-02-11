SUMMARY  = "Ultra fast JSON encoder and decoder for Python"
DESCRIPTION = "UltraJSON is an ultra fast JSON encoder and decoder written in pure C with bindings for Python 2.5+ and 3."
HOMEPAGE = "https://pypi.python.org/pypi/ujson"

LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://PKG-INFO;md5=008b4463162884ce4a43480de2e750f4"

SRCNAME = "ujson"

SRC_URI = " \
    http://pypi.python.org/packages/source/u/ujson/${SRCNAME}-${PV}.tar.gz \
"

SRC_URI[md5sum] = "42f77b0cce686dfa4da2e68480b1dd24"
SRC_URI[sha256sum] = "f66073e5506e91d204ab0c614a148d5aa938bdbf104751be66f8ad7a222f5f86"

S = "${WORKDIR}/${SRCNAME}-${PV}"

inherit setuptools

RDEPENDS_${PN} += "python-numbers"
