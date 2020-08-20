SRC_URI[dreamtwo.md5sum] = "7285c11a090b885c8961a06d4511931e"
SRC_URI[dreamtwo.sha256sum] = "410ac39fe794eaae04e1ec78904ce52c1f2f315fc75b743426b671f6b6248cd0"

require dreambox-dvb-modules.inc

RREPLACES_${PN} += "dreamframeinject"
RPROVIDES_${PN} += "dreamframeinject"
RCONFLICTS_${PN} += "dreamframeinject"

COMPATIBLE_MACHINE = "^(dreamtwo)$"
