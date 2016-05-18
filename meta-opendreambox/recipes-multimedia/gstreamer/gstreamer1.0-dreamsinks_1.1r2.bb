SRC_URI[mips32el.md5sum] = "ddca86fd1d686cc945d53ac2e1bee2d5"
SRC_URI[mips32el.sha256sum] = "93a8620be9ee07c60f70e4fff5f6098b008e68cccaae4d144386b63606e21b6a"

inherit opendreambox-precompiled-binary

require gstreamer1.0-dreamsinks.inc

COMPATIBLE_MACHINE = "^(dm820|dm7080)$"
