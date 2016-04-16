SRC_URI[mips32el.md5sum] = "fd2536386e64d07ab0c78433881887dc"
SRC_URI[mips32el.sha256sum] = "449d581970b8826fadc3949be9bc65e31e6e25677a908e23b11964c66e1739ab"

inherit opendreambox-precompiled-binary

require gstreamer1.0-dreamsinks.inc

COMPATIBLE_MACHINE = "^(dm820|dm7080)$"
