SRC_URI[mips32el.md5sum] = "1fc07371247ba78edf0097e548c190e8"
SRC_URI[mips32el.sha256sum] = "0bf2b0ec299dfe75623d7e2b08d541251d55987c99ebb8338da4ab67c1e482e0"

inherit opendreambox-precompiled-binary

require gstreamer1.0-dreamsinks.inc

COMPATIBLE_MACHINE = "^(dm520|dm820|dm7080)$"
