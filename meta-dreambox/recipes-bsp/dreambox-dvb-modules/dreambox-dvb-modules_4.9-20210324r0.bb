SRC_URI[dreamone.md5sum] = "c8565886e248a5a0d4bbda2aeaa9b507"
SRC_URI[dreamone.sha256sum] = "a292685e14a9f62d6f73b230b79bf3fbe8ccca0a820c1d370c5a3cdd14fb6e4a"
SRC_URI[dreamtwo.md5sum] = "dac11417256cdcb6d10d024b77a86322"
SRC_URI[dreamtwo.sha256sum] = "613a2a2c006f2bcd19fc761a703a208de03ddaf27517a766d195e27f7642d9f2"

require dreambox-dvb-modules.inc

RREPLACES_${PN} += "dreamframeinject"
RPROVIDES_${PN} += "dreamframeinject"
RCONFLICTS_${PN} += "dreamframeinject"

COMPATIBLE_MACHINE = "^(dreamone|dreamtwo)$"
