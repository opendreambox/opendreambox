SRC_URI[mips32el.md5sum] = "66a80b37b665b6d8a876b55c8c19d0d0"
SRC_URI[mips32el.sha256sum] = "88cc5a389f8cada92cc2c0e569708fd66d3d6e1a7bf1e32545fa48bba78a34ed"

inherit opendreambox-precompiled-binary

require gstreamer1.0-dreamsinks.inc

COMPATIBLE_MACHINE = "^(dm820|dm7080)$"
