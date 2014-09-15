LICENSE = "CLOSED"

SRC_URI = "http://dreamboxupdate.com/download/${DISTRO}/2.0.0/${PN}/${PN}_${PV}_${PACKAGE_ARCH}.tar.bz2;name=${PACKAGE_ARCH}"
SRC_URI[mips32el.md5sum] = "bbff76e5a368503e1c70018c62dc543b"
SRC_URI[mips32el.sha256sum] = "95af2c557ef31031bcab17c2102e08471955dc0edd4c769171f3cb6be242f5a9"

S = "${WORKDIR}/${PN}_${PV}_${PACKAGE_ARCH}"

do_install() {
        cp -r usr ${D}
}

require enigma2-hbbtv-plugin.inc

COMPATIBLE_MACHINE = "^(dm500hd|dm500hdv2|dm800se|dm800sev2|dm7020hd|dm7020hdv2|dm8000)$"

INHIBIT_PACKAGE_STRIP = "1"
