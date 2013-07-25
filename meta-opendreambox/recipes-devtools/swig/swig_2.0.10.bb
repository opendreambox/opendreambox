require recipes-devtools/swig/swig.inc

LIC_FILES_CHKSUM = "file://LICENSE;md5=e7807a6282784a7dde4c846626b08fc6 \
                    file://LICENSE-GPL;md5=d32239bcb673463ab874e80d47fae504 \
                    file://LICENSE-UNIVERSITIES;md5=8ce9dcc8f7c994de4a408b205c72ba08"

DEPENDS += "libpcre-native"
PR = "${INC_PR}.0"

SRC_URI[md5sum] = "6d5e7ad05b4a404e5e85db9befb70c9a"
SRC_URI[sha256sum] = "d1eef329e867124ce60838b5ad07c763146b6c8f250dd22a861ead7406f78e63"
