LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${OPENDREAMBOX_BASE}/LICENSE;md5=ed920ea8b6701825484d079e87a3a73a"

inherit packagegroup

RDEPENDS_${PN} += "connman"
RRECOMMENDS_${PN} += "connman-client"

RPROVIDES_${PN} += "packagegroup-net"
RCONFLICTS_${PN} += "packagegroup-net"
