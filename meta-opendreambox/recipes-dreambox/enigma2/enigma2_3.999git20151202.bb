PR = "${INC_PR}.2"

SRC_URI[mips32el.md5sum] = "d3582aac92840e0e4476e5814353d961"
SRC_URI[mips32el.sha256sum] = "7ed66858e5d931bced6dfe2033018e90dc0a7feae4da59174388750ec284ea66"
SRC_URI[mips32el-nf.md5sum] = "7e71fba2f01591b48f46e2d8154bc35e"
SRC_URI[mips32el-nf.sha256sum] = "961717555472dd96802af426a3677dd3c3161aa2c77275cd3da780a5dde97144"

require enigma2-bin-4.0.inc

SRC_URI += " \
	file://0001-detect-if-the-channelselection-is-initialized-in-a-w.patch \
	file://0002-ScanSetup.py-fixed-cable-transponder-search-for-non-.patch \
"
