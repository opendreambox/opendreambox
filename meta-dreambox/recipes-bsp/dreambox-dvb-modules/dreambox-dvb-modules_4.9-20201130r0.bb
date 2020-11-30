SRC_URI[dreamone.md5sum] = "a3b979ee0278c795f90d11a9e12bc8fa"
SRC_URI[dreamone.sha256sum] = "8bb91874641b0c6200c336b9ee767c073efba73fd2dd4e5c4a17f9db9b192150"
SRC_URI[dreamtwo.md5sum] = "c1c7dd25b8cdca4cf1a8348cb8b3fcf3"
SRC_URI[dreamtwo.sha256sum] = "aeb97a03a8148c6fe9aef87bdc05d5f340b13b290ff7f91d673e26d705f5aac8"

require dreambox-dvb-modules.inc

RREPLACES_${PN} += "dreamframeinject"
RPROVIDES_${PN} += "dreamframeinject"
RCONFLICTS_${PN} += "dreamframeinject"

COMPATIBLE_MACHINE = "^(dreamone|dreamtwo)$"
