SRC_URI[dreamone.md5sum] = "235d7e76fda0de3f89abf3ff76ed4998"
SRC_URI[dreamone.sha256sum] = "4333322eea9677558127a80337ec5ca9c600e6fa8ac9057771910059e350e5dd"

require dreambox-dvb-modules.inc

RREPLACES_${PN} += "dreamframeinject"
RPROVIDES_${PN} += "dreamframeinject"
RCONFLICTS_${PN} += "dreamframeinject"
