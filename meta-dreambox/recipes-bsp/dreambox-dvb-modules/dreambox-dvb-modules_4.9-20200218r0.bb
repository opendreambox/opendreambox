SRC_URI[dreamone.md5sum] = "caae63def9007a8962a1067055c1ff83"
SRC_URI[dreamone.sha256sum] = "f5794e264b29153d30487239848ab30c7b59dd141321bc0e8677d77b6a5f0df5"

require dreambox-dvb-modules.inc

RREPLACES_${PN} += "dreamframeinject"
RPROVIDES_${PN} += "dreamframeinject"
RCONFLICTS_${PN} += "dreamframeinject"
