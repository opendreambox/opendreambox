SUMMARY = "dreambox video and audio sink elements for Gstreamer 1.0"
DEPENDS = "gstreamer1.0 gstreamer1.0-plugins-base openssl systemd"

SRC_URI[aarch64.md5sum] = "385cfdeabb2d7acc2e9acb0563660f86"
SRC_URI[aarch64.sha256sum] = "98fc4049c3401ec0c1a2937e1a6869617642f950204a6cc01bb3bc393a56a245"

inherit opendreambox-precompiled-binary

FILES_${PN} = "${libdir}/gstreamer-1.0/*.so"

COMPATIBLE_MACHINE = "^(dreamone)$"
