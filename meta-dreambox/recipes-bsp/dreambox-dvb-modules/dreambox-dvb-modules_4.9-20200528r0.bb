SRC_URI[dreamone.md5sum] = "197760a00b229b58ee3e5db4aa4ec830"
SRC_URI[dreamone.sha256sum] = "49ef71cd0b638972c1c9b3e22b67d71d780b18cccff0c66a152d50dba9d77179"

require dreambox-dvb-modules.inc

RREPLACES_${PN} += "dreamframeinject"
RPROVIDES_${PN} += "dreamframeinject"
RCONFLICTS_${PN} += "dreamframeinject"
