DESCRIPTION = "WebSocket client and server library for Python 2 and 3 as well as PyPy"
HOMEPAGE = "https://github.com/Lawouach/WebSocket-for-Python"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://ws4py/__init__.py;beginline=3;endline=27;md5=be5e099a65590e7eccf41e7bd8c885e2"

SRC_URI[md5sum] = "f0603ae376707a58d205bd87a67758a2"
SRC_URI[sha256sum] = "7ac69ce3e6ec6917a5d678b65f0a18e244a4dc670db6414bc0271b3f4911237f"

PYPI_PACKAGE_HASH = "4019a739b2eefe9282d3822ef6a225250af964b117356971bd55e274193c"

inherit pypi setuptools

BBCLASSEXTEND = "native"

