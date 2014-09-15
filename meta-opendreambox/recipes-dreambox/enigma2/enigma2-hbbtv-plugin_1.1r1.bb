SRC_URI[mips32el.md5sum] = "f07e73f3b735075eecfdc97958796c94"
SRC_URI[mips32el.sha256sum] = "eb8f3520b63051b3f89c223100ea1083a36fe39255b0db0556f5a5855f14a159"

inherit opendreambox-precompiled-binary

require enigma2-hbbtv-plugin.inc

COMPATIBLE_MACHINE = "^(dm7080)$"
