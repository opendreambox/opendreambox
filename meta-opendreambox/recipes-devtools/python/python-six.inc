SUMMARY = "Python 2 and 3 compatibility library"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=83e0f622bd5ac7d575dbd83d094d69b5"

SRC_URI[md5sum] = "9ae5d1feed8c0215f4ae4adcd9207fcb"
SRC_URI[sha256sum] = "d16a0141ec1a18405cd4ce8b4613101da75da0e9a7aec5bdd4fa804d0e0eba73"

do_compile_append() {
    export BUILD_SYS=${BUILD_SYS} HOST_SYS=${HOST_SYS}
    ${PYTHON} setup.py -q bdist_egg --dist-dir ./
}
do_install_append() {
    install -m 0644 ${S}/*.egg ${D}/${PYTHON_SITEPACKAGES_DIR}/
}

RDEPENDS_${PN} += "python-io"
