SUMMARY = "dreambox video and audio sink elements for Gstreamer 1.0"
DEPENDS = "gstreamer1.0 gstreamer1.0-plugins-base openssl systemd"

SRC_URI[aarch64.md5sum] = "8049bb4c5f0502ba7ffe6965e98559a5"
SRC_URI[aarch64.sha256sum] = "9a62c26c2daa78d3008cd21b7784d01acef2d5a55565841a75d2b786da591d32"

inherit opendreambox-precompiled-binary

FILES_${PN} = "${libdir}/gstreamer-1.0/*.so"

COMPATIBLE_MACHINE = "^(dreamone)$"
