SUMMARY = "dreambox video and audio sink elements for Gstreamer 1.0"
DEPENDS = "gstreamer1.0 gstreamer1.0-plugins-base openssl"

SRC_URI[cortexa15hf-neon-vfpv4.md5sum] = "1e0b2011a8b71c1d3c2ca2ea5a152f2d"
SRC_URI[cortexa15hf-neon-vfpv4.sha256sum] = "cefd9db0a500a8d9eb1816398a0c00293b873b0c05c9c8b7ac6c35a185f288a3"
SRC_URI[mips32el.md5sum] = "5a38afa2a8554d13cc9f9a03fc4c8ff8"
SRC_URI[mips32el.sha256sum] = "00640cc57261e0c8d42dcdfdeae7514f6ef553f621b9b94522526ade566ba646"

inherit opendreambox-precompiled-binary

FILES_${PN} = "${libdir}/gstreamer-1.0/*.so"
