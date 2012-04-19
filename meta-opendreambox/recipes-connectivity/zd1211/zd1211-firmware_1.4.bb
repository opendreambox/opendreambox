DESCRIPTION = "Firmware images for the zd1211rw wireless driver"
SECTION = "kernel"
HOMEPAGE = "http://zd1211.wiki.sourceforge.net/"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=eb723b61539feef013de476e68b5c50a"

SRC_URI = "${SOURCEFORGE_MIRROR}/${BPN}/${BP}.tar.bz2"
SRC_URI[md5sum] = "19f28781d76569af8551c9d11294c870"
SRC_URI[sha256sum] = "866308f6f59f7075f075d4959dff2ede47735c751251fecd1496df1ba4d338e1"

S = "${WORKDIR}/${BPN}"

inherit allarch

do_compile() {
        :
}

do_install() {
	install -d ${D}/lib/firmware/zd1211/
	install -m 0644 zd1211* ${D}/lib/firmware/zd1211/
}

FILES_${PN} += "/lib/firmware/*"
