SRC_URI[dreamone.md5sum] = "476b555d084cd25bc24f7294a3d4ccc2"
SRC_URI[dreamone.sha256sum] = "9fe3904503f02fba32cdc5eafbd92b1c9c14530c83ef32b1056be3c73d5a70d7"
SRC_URI[dreamtwo.md5sum] = "7a60e2b6ca5c9cdf0633b59ee44d29ea"
SRC_URI[dreamtwo.sha256sum] = "9dc05351c7976bed9e419e19e3c0cabed384fe1196cbd9657b4596a5df40fb05"

require dreambox-dvb-modules.inc

RREPLACES_${PN} += "dreamframeinject"
RPROVIDES_${PN} += "dreamframeinject"
RCONFLICTS_${PN} += "dreamframeinject"

COMPATIBLE_MACHINE = "^(dreamone|dreamtwo)$"
