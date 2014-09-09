SUMMARY = "Dreambox TS/M2TS audio passthrough helper lib"

SRC_URI[mips32el.md5sum] = "8a90d5232cbdd0fdd25e7297999263b9"
SRC_URI[mips32el.sha256sum] = "e96507591916366ca6b1c0e11f8f76ee8337c7801ab4a076c4bdf17b3ff8e53a"

inherit opendreambox-precompiled-binary

FILES_${PN} = "${libdir}/lib*${SOLIBSDEV}"
FILES_SOLIBSDEV = ""

DEBIAN_NOAUTONAME_${PN} = "1"
