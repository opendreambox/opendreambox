SUMMARY = "Service identity verification for pyOpenSSL"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=8a0f079f4e6a215d6bd6f9d97cab4d5f"

SRC_URI[md5sum] = "d52392597b9c44a740abf322bfdb21e6"
SRC_URI[sha256sum] = "0630e222f59f91f3db498be46b1d879ff220955d7bbad719a5cb9ad14e3c3036"

inherit pypi setuptools

RDEPENDS_${PN} = "python-attrs \
                  python-pyasn1 \
                  python-pyasn1-modules \
                  python-pyopenssl"

PYPI_PACKAGE = "service_identity"
