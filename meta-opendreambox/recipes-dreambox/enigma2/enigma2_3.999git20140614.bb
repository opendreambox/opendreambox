PR = "${INC_PR}.1"

SRC_URI[mips32el.md5sum] = "8adbd28eb8ae16863d15e2b85ef8192e"
SRC_URI[mips32el.sha256sum] = "982247ad30d7dc5931e0c55a7186d750ad6d5625d734ba69f6f8ad75ba6f7794"
SRC_URI[mips32el-nf.md5sum] = "5e5beca1457fd28edcf4006aebb540ae"
SRC_URI[mips32el-nf.sha256sum] = "40b7e884d2677579212350a3e47d2081562a04759eca2664dd3a056576014458"

require enigma2-bin-4.0.inc

SRC_URI += " file://0001-fixed-typo.patch"
