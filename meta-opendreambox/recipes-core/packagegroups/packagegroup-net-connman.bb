LICENSE = "MIT"

inherit packagegroup

RDEPENDS_${PN} += "connman"
RRECOMMENDS_${PN} += "connman-client connman-wait-online"

RPROVIDES_${PN} += "packagegroup-net"
RCONFLICTS_${PN} += "packagegroup-net"
