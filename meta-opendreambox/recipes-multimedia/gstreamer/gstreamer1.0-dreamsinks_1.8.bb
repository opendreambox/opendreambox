SUMMARY = "dreambox video and audio sink elements for Gstreamer 1.0"
DEPENDS = "gstreamer1.0 gstreamer1.0-plugins-base openssl systemd"

SRC_URI[aarch64.md5sum] = "316723c93c21cec486faa3f2d3cb41f8"
SRC_URI[aarch64.sha256sum] = "3c6e3002fbe489eaaf4a8160eda99df0573259be64a96db97d5db550a930834c"

inherit opendreambox-precompiled-binary

FILES_${PN} = "${libdir}/gstreamer-1.0/*.so"

COMPATIBLE_MACHINE = "^(dreamone)$"
