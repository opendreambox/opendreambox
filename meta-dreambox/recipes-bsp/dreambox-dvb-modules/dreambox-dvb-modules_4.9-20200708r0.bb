SRC_URI[dreamone.md5sum] = "235d7e76fda0de3f89abf3ff76ed4998"
SRC_URI[dreamone.sha256sum] = "4333322eea9677558127a80337ec5ca9c600e6fa8ac9057771910059e350e5dd"
SRC_URI[dreamtwo.md5sum] = "6479a2c1c4b3f937f9a612d20385e777"
SRC_URI[dreamtwo.sha256sum] = "8636694bdb0918258ccea8e44851ef9a7cb9276c4b795cdd58b1b34e332c0712"

require dreambox-dvb-modules.inc

RREPLACES_${PN} += "dreamframeinject"
RPROVIDES_${PN} += "dreamframeinject"
RCONFLICTS_${PN} += "dreamframeinject"
