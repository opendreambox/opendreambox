SUMMARY = "dreambox video and audio sink elements for Gstreamer 1.0"
DEPENDS = "gstreamer1.0 gstreamer1.0-plugins-base openssl"

SRC_URI[armv7ahf-neon.md5sum] = "8659c6043fa8608f01b2162a0974905f"
SRC_URI[armv7ahf-neon.sha256sum] = "1be1ce32313c7748ae3c6fc8b05911ed697f46041f56075b097677789bb908cc"
SRC_URI[mips32el.md5sum] = "ccbe57d58d75207f4d90e5363edd05c9"
SRC_URI[mips32el.sha256sum] = "442aa1ae46b3b1039a77206473811153562d3d5f45998c0f5c690960f937226c"

inherit opendreambox-precompiled-binary

FILES_${PN} = "${libdir}/gstreamer-1.0/*.so"
