DESCRIPTION = "Screen-scraping library"
HOMEPAGE = "https://pypi.python.org/pypi/beautifulsoup4/"
SECTION = "devel/python"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://COPYING.txt;md5=f2d38d8a40bf73fd4b3d16ca2e5882d1"

PR = "r0"
SRCNAME = "beautifulsoup4"

SRC_URI = "https://pypi.python.org/packages/source/b/${SRCNAME}/${SRCNAME}-${PV}.tar.gz"

SRC_URI[md5sum] = "c71f53fcb2580c376ab7b010a9178983"
SRC_URI[sha256sum] = "945065979fb8529dd2f37dbb58f00b661bdbcbebf954f93b32fdf5263ef35348"

S = "${WORKDIR}/${SRCNAME}-${PV}"

inherit setuptools

# avoid "error: option --single-version-externally-managed not recognized"
DISTUTILS_INSTALL_ARGS = "--root=${D} \
    --prefix=${prefix} \
    --install-lib=${PYTHON_SITEPACKAGES_DIR} \
    --install-data=${datadir}"