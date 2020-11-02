SRC_URI[dreamone.md5sum] = "37aad2e98fd878d94836baba53cafd3d"
SRC_URI[dreamone.sha256sum] = "dd9c384bca55c1067d0cc71d6dca36a9442204299500b161f5ba215545353756"
SRC_URI[dreamtwo.md5sum] = "f73f3e6e1825f851564df152e3809a24"
SRC_URI[dreamtwo.sha256sum] = "66a41acd50c26e713a2525d55f10b37f6fd989d637048de3d63a13be040c3dbc"

require dreambox-dvb-modules.inc

RREPLACES_${PN} += "dreamframeinject"
RPROVIDES_${PN} += "dreamframeinject"
RCONFLICTS_${PN} += "dreamframeinject"

COMPATIBLE_MACHINE = "^(dreamone|dreamtwo)$"
