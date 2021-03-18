SRC_URI[dreamone.md5sum] = "c2f0700df91700122f510c4525ed47c3"
SRC_URI[dreamone.sha256sum] = "cfe114c44133ea0ba507e88157abf4e5e4bc3f2a683427c7b050b6c421ebeae7"
SRC_URI[dreamtwo.md5sum] = "07e6a4c72aa3114aef5ade0bb572d3e9"
SRC_URI[dreamtwo.sha256sum] = "331c55dfb6a353a4aae8d2208ba8eba90eda2feec0daac6abac6e233c5b5a5d2"

require dreambox-dvb-modules.inc

RREPLACES_${PN} += "dreamframeinject"
RPROVIDES_${PN} += "dreamframeinject"
RCONFLICTS_${PN} += "dreamframeinject"

COMPATIBLE_MACHINE = "^(dreamone|dreamtwo)$"
