SRC_URI[mips32el.md5sum] = "c7815af4c5606a85990c19c3b93d0b92"
SRC_URI[mips32el.sha256sum] = "2885b77f78c19c6b7eaefe31cdeefe5a52b4a1fd29d711efa8d636a45e4b1c18"

inherit opendreambox-precompiled-binary

require enigma2-hbbtv-plugin.inc

COMPATIBLE_MACHINE = "^(dm520|dm820|dm7080)$"
