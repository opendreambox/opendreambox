SRC_URI[dreamtwo.md5sum] = "1ebff55e8a2b2b43d2a6f283b0a2dddf"
SRC_URI[dreamtwo.sha256sum] = "4e1d56edf2035bad0a57027ef697cd0724554a339fcec460216323f128511912"
SRC_URI[dreamone.md5sum] = "6cec47f0b50b790d68ef5d0a74704d11"
SRC_URI[dreamone.sha256sum] = "e86df7d49287970a8ea1a76fb0e38f89e0197958f8778f3cccb458cae32653b0"

require dreambox-dvb-modules.inc

RREPLACES_${PN} += "dreamframeinject"
RPROVIDES_${PN} += "dreamframeinject"
RCONFLICTS_${PN} += "dreamframeinject"

COMPATIBLE_MACHINE = "^(dreamone|dreamtwo)$"
