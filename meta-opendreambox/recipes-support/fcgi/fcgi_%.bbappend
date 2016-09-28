PACKAGES =+ "${PN}-bin lib${PN} lib${PN}++"

RDEPENDS_${PN} = "${PN}-bin lib${PN} lib${PN}++"

FILES_${PN}-bin = "${bindir}/cgi-fcgi"
FILES_lib${PN} = "${libdir}/libfcgi${SOLIBS}"
FILES_lib${PN}++ = "${libdir}/libfcgi++${SOLIBS}"

ALLOW_EMPTY_${PN} = "1"
