SRC_URI[mips32el.md5sum] = "2abf946b624b9c691229283a71ed5208"
SRC_URI[mips32el.sha256sum] = "a26aaae8a0dac2f2bb4c4dffca67b866ee10711a99fb27220ac02c8d50b064dd"

inherit opendreambox-precompiled-binary

require gstreamer1.0-dreamsinks.inc

COMPATIBLE_MACHINE = "^(dm820|dm7080)$"
