SUMMARY = "dreambox video and audio sink elements for Gstreamer 1.0"
DEPENDS = "gstreamer1.0 gstreamer1.0-plugins-base openssl systemd"

SRC_URI[aarch64.md5sum] = "0c9a90e9e93d5eeeec4ad880817900c0"
SRC_URI[aarch64.sha256sum] = "04c10de50c45bb2ed4af10886fb41c33157d483f261b725e158a287eddb356a4"

inherit opendreambox-precompiled-binary

FILES_${PN} = "${libdir}/gstreamer-1.0/*.so"

COMPATIBLE_MACHINE = "^(dreamone)$"
