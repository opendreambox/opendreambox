PR = "${INC_PR}.1"

SRC_URI[mips32el.md5sum] = "c7ae362368a3cd8dab447bafbab947e2"
SRC_URI[mips32el.sha256sum] = "590210c6b7297ed31294f296711e6b7100be2418789900530071d1c655121288"
SRC_URI[mips32el-nf.md5sum] = "9633185eb46d5a9961c2a75659bbbddd"
SRC_URI[mips32el-nf.sha256sum] = "51b18af76323abeea2cf4d0c859d0ed88e84ecb6d02f862411da6981a526e7b1"

require enigma2-bin-4.0.inc

SRC_URI += " \
	file://0001-Tools-LogConfig-small-fix.patch \
	file://0002-LogConfig-fix-log-level-handling-ConfigSelection-use.patch \
"
