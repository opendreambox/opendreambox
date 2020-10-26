SRC_URI[dreamone.md5sum] = "92d192e9631a43447ca84963e4726356"
SRC_URI[dreamone.sha256sum] = "41cdad1410ce3f1b66e5a772070400f12c635ddfc66a87818c88291a10cc6850"
SRC_URI[dreamtwo.md5sum] = "288767f28ca2931b9c3b069eae0fba62"
SRC_URI[dreamtwo.sha256sum] = "c270a82d88d26b713abb3f5b1f4b0da96607c24fc60e798156434c866da41c99"

require dreambox-dvb-modules.inc

RREPLACES_${PN} += "dreamframeinject"
RPROVIDES_${PN} += "dreamframeinject"
RCONFLICTS_${PN} += "dreamframeinject"

COMPATIBLE_MACHINE = "^(dreamone|dreamtwo)$"
