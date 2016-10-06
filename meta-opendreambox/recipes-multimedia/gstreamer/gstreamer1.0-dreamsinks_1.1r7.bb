SRC_URI[armv7ahf-neon.md5sum] = "13d253b47a7bad2580d9d01ad82507df"
SRC_URI[armv7ahf-neon.sha256sum] = "1192c59999589de8ea861dd19f5e77c2a9bb0a5be56531ab84c6bb26a7f4c8f5"
SRC_URI[mips32el.md5sum] = "9d3d67e506633b1c820dd2f61e0cb03d"
SRC_URI[mips32el.sha256sum] = "0b13202dd85cab0ea1f0d9285db77d809c2d9ea43d36687cca000b726ccc5bd9"

inherit opendreambox-precompiled-binary

require gstreamer1.0-dreamsinks.inc
