SUMMARY = "opendreambox: package management task (${PKGTYPE} version)"
LICENSE = "MIT"

inherit packagegroup

RDEPENDS_${PN} += "distro-feed-configs-${PKGTYPE}"

RPROVIDES_${PN} = "packagegroup-pkg"
RCONFLICTS_${PN} = "packagegroup-pkg"
