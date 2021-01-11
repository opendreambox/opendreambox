SUMMARY = "Service identity verification for pyOpenSSL"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=8a0f079f4e6a215d6bd6f9d97cab4d5f"

SRC_URI[md5sum] = "c6b8bac93e7d899a1da313a19cc6570a"
SRC_URI[sha256sum] = "0858a54aabc5b459d1aafa8a518ed2081a285087f349fe3e55197989232e2e2d"

inherit pypi setuptools

RDEPENDS_${PN} = "python-attrs \
                  python-pyasn1 \
                  python-pyasn1-modules \
                  python-pyopenssl"

PYPI_PACKAGE = "service_identity"
