SRC_URI[dreamone.md5sum] = "041b3dd8fa7ec4edf23f1c05a043db51"
SRC_URI[dreamone.sha256sum] = "383d7492d0c58ed8fb5f1613413b42f3eb47f6ae65a887a0a4025ac59c779ec0"

require dreambox-dvb-modules.inc

RREPLACES_${PN} += "dreamframeinject"
RPROVIDES_${PN} += "dreamframeinject"
RCONFLICTS_${PN} += "dreamframeinject"
