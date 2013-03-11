SUMMARY = "Dreambox TS/M2TS audio passthrough helper lib"

SRC_URI[mips32el.md5sum] = "be253024a9c3a5ac7e1d68011011dede"
SRC_URI[mips32el.sha256sum] = "b63a1b0fe4f6cc540e216023d97f27bdfeca98533fd2c5023e31c6ded2de6f20"

inherit opendreambox-precompiled-binary

FILES_${PN} = "${libdir}"

DEBIAN_NOAUTONAME_${PN} = "1"
