SRC_URI[dreamtwo.md5sum] = "d81f60143a5bef7c092f9aa5b2f8e13f"
SRC_URI[dreamtwo.sha256sum] = "5696710cf32b44ceec5c537b0455fd9b5652b90cf611f39670e68de403bf71d3"
SRC_URI[dreamone.md5sum] = "14f2e4c4a641b8686d6fe7cae90d7d32"
SRC_URI[dreamone.sha256sum] = "f713146fb32caca2de129d3dca9d9d94a693c907359b972f060b28fb28a1a8f7"

require dreambox-dvb-modules.inc

RREPLACES_${PN} += "dreamframeinject"
RPROVIDES_${PN} += "dreamframeinject"
RCONFLICTS_${PN} += "dreamframeinject"

COMPATIBLE_MACHINE = "^(dreamone|dreamtwo)$"
