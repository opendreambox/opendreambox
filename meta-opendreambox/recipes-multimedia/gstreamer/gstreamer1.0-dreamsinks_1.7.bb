SUMMARY = "dreambox video and audio sink elements for Gstreamer 1.0"
DEPENDS = "gstreamer1.0 gstreamer1.0-plugins-base openssl"

SRC_URI[mips32el.md5sum] = "69673b790fbadfafbaeb9553931cb3d9"
SRC_URI[mips32el.sha256sum] = "5c592202963c8fa8c4d70b1c62cca462d392fac4330a98617fc5c0f7bf25a2f6"
SRC_URI[cortexa15hf-neon-vfpv4.md5sum] = "491c3ccdc3a08acb47431556685ccee9"
SRC_URI[cortexa15hf-neon-vfpv4.sha256sum] = "28ccb8543c398aa28d04b7c06dbc284951d9815d65bee467ca139ad1df48c0cc"

inherit opendreambox-precompiled-binary

FILES_${PN} = "${libdir}/gstreamer-1.0/*.so"
