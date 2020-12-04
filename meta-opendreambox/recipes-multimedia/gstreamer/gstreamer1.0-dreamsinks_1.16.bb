SUMMARY = "dreambox video and audio sink elements for Gstreamer 1.0"
DEPENDS = "gstreamer1.0 gstreamer1.0-plugins-base openssl systemd"

SRC_URI[aarch64.md5sum] = "aed8548018a8847a67c83789ab0f81f7"
SRC_URI[aarch64.sha256sum] = "12de5d5c29d1d7d95ff3b93717c9dbd68d4941ce79b56efea43e94ad30f30cc4"

inherit opendreambox-precompiled-binary

FILES_${PN} = "${libdir}/gstreamer-1.0/*.so"

COMPATIBLE_MACHINE = "^(dreamone|dreamtwo)$"
