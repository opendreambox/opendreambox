SRC_URI[dreamone.md5sum] = "bf5e465084609744a14f772ea0698901"
SRC_URI[dreamone.sha256sum] = "cdd9f0a41eeda838ecae569a1a8a80baa87ce5fd6d203b0b629c6699c03c3026"

require dreambox-dvb-modules.inc

RREPLACES_${PN} += "dreamframeinject"
RPROVIDES_${PN} += "dreamframeinject"
RCONFLICTS_${PN} += "dreamframeinject"
