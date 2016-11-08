SUMMARY = "opendreambox: package management task (${PKGTYPE} version)"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${OPENDREAMBOX_BASE}/LICENSE;md5=8f242b441da515e30c7b07f2cc6f4d5c"

inherit packagegroup

RDEPENDS_${PN} += "distro-feed-configs-${PKGTYPE}"

RPROVIDES_${PN} = "packagegroup-pkg"
RCONFLICTS_${PN} = "packagegroup-pkg"
