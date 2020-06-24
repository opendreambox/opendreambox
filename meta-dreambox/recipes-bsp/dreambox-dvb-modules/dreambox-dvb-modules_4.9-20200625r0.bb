SRC_URI[dreamone.md5sum] = "3bd177a2bd5cfc681ad3de7283dd8902"
SRC_URI[dreamone.sha256sum] = "41a2ed230b45349925afe846dff7475de4aff669aa8ba2c94bb2bd078f73cee8"

require dreambox-dvb-modules.inc

RREPLACES_${PN} += "dreamframeinject"
RPROVIDES_${PN} += "dreamframeinject"
RCONFLICTS_${PN} += "dreamframeinject"
