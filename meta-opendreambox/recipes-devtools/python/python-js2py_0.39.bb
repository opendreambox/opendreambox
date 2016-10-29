SUMMARY = "JavaScript to Python Translator & JavaScript interpreter written in 100% pure Python"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=faa744092d3fb3314632e815e7c3a560"

SRC_URI[md5sum] = "c40b07dc7e8e51d268a70146e32b0603"
SRC_URI[sha256sum] = "3bdc8c57518a21cec2cb97a922ecaeb826471d5e13de45a63a91a2b16ad3a1ac"

inherit pypi setuptools

RDEPENDS_${PN} = "python-json python-pprint python-six"
