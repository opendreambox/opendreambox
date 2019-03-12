RDEPENDS_${PN} = "apt apt-opkg dpkg"
RRECOMMENDS_${PN} = "apt-transport-https"

require packagegroup-pkg.inc

PKGTYPE = "deb"
