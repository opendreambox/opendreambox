SRC_URI[mips32el.md5sum] = "721c54daffe174017ae5e8a2c6763249"
SRC_URI[mips32el.sha256sum] = "d2105f609bee374b2b324b33bc0eaba4a65b729a32b75a7ea06bdcf85c6151e6"
SRC_URI[mips32el-nf.md5sum] = "7d6ffaf1e43e1c89c8baf8d8508690e2"
SRC_URI[mips32el-nf.sha256sum] = "2406833b4fa0ca45e160e004ff1a28333e41129f2166a7adf48aff36f53d391e"

require enigma2-bin-4.0.inc

SRC_URI += " \
        file://0001-HbbTV.py-fixed-UserAgent-handling.patch \
"
