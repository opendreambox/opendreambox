SRC_URI[dreamone.md5sum] = "ccee34a5defb6285b43229af239b97b6"
SRC_URI[dreamone.sha256sum] = "d292564df1c53d00afec5c65be01134e286c92ae34d070cebbfcf586928ea2c6"

require dreambox-dvb-modules.inc

RREPLACES_${PN} += "dreamframeinject"
RPROVIDES_${PN} += "dreamframeinject"
RCONFLICTS_${PN} += "dreamframeinject"
