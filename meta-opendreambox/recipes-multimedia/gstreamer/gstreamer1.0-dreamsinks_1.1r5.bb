SRC_URI[mips32el.md5sum] = "af7b4b96e20ee4de9276b37f38611288"
SRC_URI[mips32el.sha256sum] = "8557832be57aa6690bb883a8551ab8e6f22506f02592aa8526f346251b46b192"

inherit opendreambox-precompiled-binary

require gstreamer1.0-dreamsinks.inc

COMPATIBLE_MACHINE = "^(dm820|dm7080)$"
