SUMMARY = "Dreambox TS/M2TS audio passthrough helper lib"

SRC_URI[mips32el.md5sum] = "876af4eacdb21cfa5c5dbf1d8f1f9655"
SRC_URI[mips32el.sha256sum] = "3c21790860cc4dda2a0a9eec0e134b511284acab69840e0d0b3eeec282695cb8"

inherit opendreambox-precompiled-binary

FILES_${PN} = "${libdir}/lib*${SOLIBSDEV}"
FILES_SOLIBSDEV = ""

DEBIAN_NOAUTONAME_${PN} = "1"
