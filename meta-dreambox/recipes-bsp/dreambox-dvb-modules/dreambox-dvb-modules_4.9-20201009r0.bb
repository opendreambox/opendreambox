SRC_URI[dreamone.md5sum] = "a16437b28aee5baf23515d4002ffa8b7"
SRC_URI[dreamone.sha256sum] = "35d8217f7bbf6488ae1a53277e0c054736eb042051e6e284e9893b56ef64dbd3"
SRC_URI[dreamtwo.md5sum] = "dc545139b28e314733dc4c540f923500"
SRC_URI[dreamtwo.sha256sum] = "fad251e7a878ca7d62da3d86f0e51a83196d94e3a6b3d53a38dc2aa85f162ccc"

require dreambox-dvb-modules.inc

RREPLACES_${PN} += "dreamframeinject"
RPROVIDES_${PN} += "dreamframeinject"
RCONFLICTS_${PN} += "dreamframeinject"

COMPATIBLE_MACHINE = "^(dreamone|dreamtwo)$"
