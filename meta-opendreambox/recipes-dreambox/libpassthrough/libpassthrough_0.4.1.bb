SUMMARY = "Dreambox TS/M2TS audio passthrough helper lib"
DEPENDS = "libdlsym openssl"

SRC_URI[armv7ahf-neon.md5sum] = "6983953f2157727c286598236f51eef5"
SRC_URI[armv7ahf-neon.sha256sum] = "26e6147c2ebd18cf3b9b02d012047580d00fef8a1d1e24ff10b95809e8c80ab7"

inherit opendreambox-precompiled-binary

FILES_${PN} = "${libdir}/lib*${SOLIBSDEV}"
FILES_SOLIBSDEV = ""

DEBIAN_NOAUTONAME_${PN} = "1"

COMPATIBLE_MACHINE = "^(dm900)$"
