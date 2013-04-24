require recipes-devtools/swig/swig.inc

LIC_FILES_CHKSUM = "file://LICENSE;md5=e7807a6282784a7dde4c846626b08fc6 \
                    file://LICENSE-GPL;md5=d32239bcb673463ab874e80d47fae504 \
                    file://LICENSE-UNIVERSITIES;md5=8ce9dcc8f7c994de4a408b205c72ba08"

DEPENDS += "libpcre-native"
PR = "${INC_PR}.0"

SRC_URI[md5sum] = "54d534b14a70badc226129159412ea85"
SRC_URI[sha256sum] = "586954000d297fafd7e91d1ad31089cc7e249f658889d11a44605d3662569539"
