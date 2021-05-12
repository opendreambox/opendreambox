SUMMARY = "Dill extends python’s pickle module for serializing and de-serializing python objects to the majority of the built-in python types"
HOMEPAGE = "https://pypi.org/project/dill/"
SECTION = "devel/python"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://LICENSE;md5=90fee9f98d11d59df3f8aa813ff9a3de"

SRC_URI[md5sum] = "99c878e2e4e924f3234c0efcbcff6abf"
SRC_URI[sha256sum] = "efb7f6cb65dba7087c1e111bb5390291ba3616741f96840bfc75792a1a9b5ded"

PYPI_PACKAGE_EXT = "zip"

inherit pypi setuptools

