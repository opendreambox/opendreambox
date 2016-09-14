SRC_URI[armv7ahf-neon.md5sum] = "57112734a6723ceac658194767672807"
SRC_URI[armv7ahf-neon.sha256sum] = "ccee5f463417e68656a4ecb2146d0f9fadd968c0e9a682b5707a02c46fe6553c"
SRC_URI[mips32el.md5sum] = "d9f58eb22f0f5ba9eaf82deaed172d49"
SRC_URI[mips32el.sha256sum] = "93a0a0ae5b30eb9e1f094bc8d3bceacfd943092372b76121abc03ad8c6ce15f4"

inherit opendreambox-precompiled-binary

require enigma2-hbbtv-plugin.inc

COMPATIBLE_MACHINE = "^(dm520|dm820|dm900|dm7080)$"
