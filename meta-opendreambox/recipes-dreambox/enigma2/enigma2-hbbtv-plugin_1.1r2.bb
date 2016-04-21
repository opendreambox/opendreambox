SRC_URI[mips32el.md5sum] = "d2b6a2b23221e0a1ca789f4afaa024c7"
SRC_URI[mips32el.sha256sum] = "5d3e7eefe02c56e506e26ece8d2a8fa9190571c44f9393de8e495935793f5534"

inherit opendreambox-precompiled-binary

require enigma2-hbbtv-plugin.inc

COMPATIBLE_MACHINE = "^(dm520|dm820|dm7080)$"
