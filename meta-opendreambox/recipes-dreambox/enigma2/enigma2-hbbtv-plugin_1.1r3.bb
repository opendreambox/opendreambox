SRC_URI[mips32el.md5sum] = "d9f58eb22f0f5ba9eaf82deaed172d49"
SRC_URI[mips32el.sha256sum] = "93a0a0ae5b30eb9e1f094bc8d3bceacfd943092372b76121abc03ad8c6ce15f4"

inherit opendreambox-precompiled-binary

require enigma2-hbbtv-plugin.inc

COMPATIBLE_MACHINE = "^(dm520|dm820|dm7080)$"
