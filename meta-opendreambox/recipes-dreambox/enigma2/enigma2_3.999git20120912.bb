PR = "${INC_PR}.1"

SRC_URI[mips32el.md5sum] = "2a8f5bf0e1f2d7076fe7a601deafa7bf"
SRC_URI[mips32el.sha256sum] = "0362fa38a273e9a46cce9379121777427f00370a19431063719dad176d03a39c"
SRC_URI[mips32el-nf.md5sum] = "3440ed48ced42bc394e8e205696db1a3"
SRC_URI[mips32el-nf.sha256sum] = "80b539663b4988743ddd60264f7500dfc79d4ae01c0ea7c3cb82cc3a90ac8a73"

SRC_URI_append = " file://re-enable-libpagecache.patch"

require enigma2-bin-4.0.inc
