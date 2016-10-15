SRC_URI[mips32el.md5sum] = "c488e26cd39c88bf357518e4edab085d"
SRC_URI[mips32el.sha256sum] = "91e3d1f32a1a8788418e5f4e9006e885d01e79223e70687290d21f4b3e1ce460"

inherit opendreambox-precompiled-binary

require gstreamer1.0-dreamsinks.inc

COMPATIBLE_MACHINE = "^(dm520|dm820|dm7080)$"
