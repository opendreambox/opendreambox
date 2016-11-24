SRC_URI[mips32el.md5sum] = "7ccecd2b98bed38be5b8915ed9111bd8"
SRC_URI[mips32el.sha256sum] = "9713461db048242127f466d87153fc0efa15710b6d262c682ceaa1e784ecbba4"

inherit opendreambox-precompiled-binary

require enigma2-hbbtv-plugin.inc

COMPATIBLE_MACHINE = "^(dm520|dm820|dm7080)$"
