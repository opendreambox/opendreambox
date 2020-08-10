SRC_URI[dreamtwo.md5sum] = "ad39aced832a6ced3d237f8bb25552a4"
SRC_URI[dreamtwo.sha256sum] = "271289765372d83fbf5bd79f8dbc0fad1d65b5bf73fd4f8a685520e182e92071"

require dreambox-dvb-modules.inc

RREPLACES_${PN} += "dreamframeinject"
RPROVIDES_${PN} += "dreamframeinject"
RCONFLICTS_${PN} += "dreamframeinject"

COMPATIBLE_MACHINE = "^(dreamtwo)$"
