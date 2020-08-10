SRC_URI[dreamone.md5sum] = "5aed629529d65ba098b5cf914f43e4e0"
SRC_URI[dreamone.sha256sum] = "bf1464df96cc2a0e3b0501ef06ccddd2bc248d0299b941078540e493ff95e6dd"

require dreambox-dvb-modules.inc

RREPLACES_${PN} += "dreamframeinject"
RPROVIDES_${PN} += "dreamframeinject"
RCONFLICTS_${PN} += "dreamframeinject"

COMPATIBLE_MACHINE = "^(dreamone)$"
