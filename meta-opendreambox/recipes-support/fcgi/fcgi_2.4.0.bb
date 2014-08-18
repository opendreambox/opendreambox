DESCRIPTION = "FastCGI is a protocol for interfacing interactive programs with a web server."
HOMEPAGE = "http://www.fastcgi.com"
LICENSE = "OML"
LIC_FILES_CHKSUM = "file://LICENSE.TERMS;md5=e3aacac3a647af6e7e31f181cda0a06a"

SRC_URI = "http://fossies.org/linux/www/${BP}.tar.gz \
           file://Fix_EOF_not_declared_issue.patch \
           file://add_foreign_to_AM_INIT_AUTOMAKE.patch \
"
SRC_URI[md5sum] = "d15060a813b91383a9f3c66faf84867e"
SRC_URI[sha256sum] = "66fc45c6b36a21bf2fbbb68e90f780cc21a9da1fffbae75e76d2b4402d3f05b9"

inherit autotools

PACKAGES =+ "${PN}-bin lib${PN} lib${PN}++"

RDEPENDS_${PN} = "${PN}-bin lib${PN} lib${PN}++"

FILES_${PN}-bin = "${bindir}/cgi-fcgi"
FILES_lib${PN} = "${libdir}/libfcgi${SOLIBS}"
FILES_lib${PN}++ = "${libdir}/libfcgi++${SOLIBS}"

ALLOW_EMPTY_${PN} = "1"

PARALLEL_MAKE = ""
