LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${OPENDREAMBOX_BASE}/LICENSE;md5=8f242b441da515e30c7b07f2cc6f4d5c"

inherit packagegroup

RDEPENDS_${PN} += "connman"
RRECOMMENDS_${PN} += "connman-client"

RPROVIDES_${PN} += "packagegroup-net"
RCONFLICTS_${PN} += "packagegroup-net"
