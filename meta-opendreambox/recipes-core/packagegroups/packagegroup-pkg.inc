SUMMARY = "opendreambox: package management task (${PKGTYPE} version)"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${OPENDREAMBOX_BASE}/LICENSE;md5=ed920ea8b6701825484d079e87a3a73a"

inherit packagegroup

RDEPENDS_${PN} += "distro-feed-configs-${PKGTYPE}"

RPROVIDES_${PN} = "packagegroup-pkg"
RCONFLICTS_${PN} = "packagegroup-pkg"
