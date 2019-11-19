SRC_URI[dreamone.md5sum] = "8905559c5b4bb48fb669f43269d75020"
SRC_URI[dreamone.sha256sum] = "aa5bfa271a79be3df970030f611379e97c17f119c028acd99d0538d5fd581f71"

require dreambox-dvb-modules.inc

RREPLACES_${PN} += "dreamframeinject"
RPROVIDES_${PN} += "dreamframeinject"
RCONFLICTS_${PN} += "dreamframeinject"
