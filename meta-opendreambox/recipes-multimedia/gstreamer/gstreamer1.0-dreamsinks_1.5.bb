SUMMARY = "dreambox video and audio sink elements for Gstreamer 1.0"
DEPENDS = "gstreamer1.0 gstreamer1.0-plugins-base openssl"

SRC_URI[mips32el.md5sum] = "4a0b4a4653b60f344a9479f084f6ffd5"
SRC_URI[mips32el.sha256sum] = "a1b714e1c0cc592c62399eb908073dd1a37c6cbd6b465a41d39ea5354cbe5474"
SRC_URI[cortexa15hf-neon-vfpv4.md5sum] = "ed9087e8d5d972519d9964ee2e272361"
SRC_URI[cortexa15hf-neon-vfpv4.sha256sum] = "3aa689cc4dc12379511ebc83a2e491b11292b3f1a81c2c169771127d3ffc1a02"

inherit opendreambox-precompiled-binary

FILES_${PN} = "${libdir}/gstreamer-1.0/*.so"
