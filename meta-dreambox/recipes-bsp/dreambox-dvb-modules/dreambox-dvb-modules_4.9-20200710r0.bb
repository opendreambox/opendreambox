SRC_URI[dreamone.md5sum] = "5aed629529d65ba098b5cf914f43e4e0"
SRC_URI[dreamone.sha256sum] = "bf1464df96cc2a0e3b0501ef06ccddd2bc248d0299b941078540e493ff95e6dd"
SRC_URI[dreamtwo.md5sum] = "113f75d77975b06491f1ff5029d54b1b"
SRC_URI[dreamtwo.sha256sum] = "749301ad5cc7aebf368c381dc7e689303825b223354f61dc6a3e15fb6572e763"

require dreambox-dvb-modules.inc

RREPLACES_${PN} += "dreamframeinject"
RPROVIDES_${PN} += "dreamframeinject"
RCONFLICTS_${PN} += "dreamframeinject"
