SUMMARY = "dreambox video and audio sink elements for Gstreamer 1.0"
DEPENDS = "gstreamer1.0 gstreamer1.0-plugins-base openssl systemd"

SRC_URI[aarch64.md5sum] = "7367412fa359f1840d20217349df51f8"
SRC_URI[aarch64.sha256sum] = "f313a2ede5c3ea98f382bc8c07fd685858ce4133a6b8917eaa62e55ae825618a"

inherit opendreambox-precompiled-binary

FILES_${PN} = "${libdir}/gstreamer-1.0/*.so"

COMPATIBLE_MACHINE = "^(dreamone|dreamtwo)$"
