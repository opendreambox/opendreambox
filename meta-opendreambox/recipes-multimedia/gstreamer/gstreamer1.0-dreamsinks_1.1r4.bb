SRC_URI[mips32el.md5sum] = "c794d8ff96a6ce9c179be6394e4ca393"
SRC_URI[mips32el.sha256sum] = "1a2ecb88822ddcd8618db3bc3049be0803b0fbf4ef77671bc3b630c832dba6f4"

inherit opendreambox-precompiled-binary

require gstreamer1.0-dreamsinks.inc

COMPATIBLE_MACHINE = "^(dm820|dm7080)$"
