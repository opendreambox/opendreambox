SUMMARY = "dreambox video and audio sink elements for Gstreamer 1.0"
DEPENDS = "gstreamer1.0 gstreamer1.0-plugins-base openssl systemd"

SRC_URI[aarch64.md5sum] = "15d6fd72eb98490511065b8edc7d3e38"
SRC_URI[aarch64.sha256sum] = "22b2e7c385b59b02f9b4313ada05f01a4d36f366e0f49f7465b2bbcd5f9a7f34"

inherit opendreambox-precompiled-binary

FILES_${PN} = "${libdir}/gstreamer-1.0/*.so"

COMPATIBLE_MACHINE = "^(dreamone)$"
