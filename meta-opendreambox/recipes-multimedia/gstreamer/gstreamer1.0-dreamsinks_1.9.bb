SUMMARY = "dreambox video and audio sink elements for Gstreamer 1.0"
DEPENDS = "gstreamer1.0 gstreamer1.0-plugins-base openssl systemd"

SRC_URI[aarch64.md5sum] = "bc9d9dfe4a83fc9121bdc5098fcb7e7d"
SRC_URI[aarch64.sha256sum] = "b60356a9011366bdf0b8401c28e846efd1722a8aa51ed48f502b4fa99d0b53da"

inherit opendreambox-precompiled-binary

FILES_${PN} = "${libdir}/gstreamer-1.0/*.so"

COMPATIBLE_MACHINE = "^(dreamone)$"
