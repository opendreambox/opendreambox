PR = "${INC_PR}.1"

SRC_URI[mips32el.md5sum] = "de38975b36783b2c621a1f6dfcb2688e" 
SRC_URI[mips32el.sha256sum] = "ab03131d1850ce61bc27bb8544ee78dbb00c25e93bac2646f056d1becf62b5fd"
SRC_URI[mips32el-nf.md5sum] = "eda757404e749b8ba0285fb0b255bcd4"
SRC_URI[mips32el-nf.sha256sum] = "0b022b1528be784b0bee255381f14cd74b8bbcacb7b96806f45192713ea97055"

SRC_URI += "file://0001-show-n-a-for-unknown-services-remove-duplicate-getNa.patch"

require enigma2-bin-4.0.inc
