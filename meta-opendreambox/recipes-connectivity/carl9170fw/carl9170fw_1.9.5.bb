DESCRIPTION = "Firmware for the carl9170 wireless driver"
HOMEPAGE = "http://linuxwireless.org/en/users/Drivers/carl9170.fw"
SECTION = "kernel"
LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://COPYRIGHT;md5=b0e5b5cb9edb5794f96103f3598518ac"
SRCREV = "500397585d53a08f83d1798c0e871c91667a2be3"

SRC_URI = "git://github.com/chunkeey/carl9170fw.git;protocol=git \
           file://carl9170-1.fw"
SRC_URI[md5sum] = "a7775683a0839c679a7e47622b1caad9"
SRC_URI[sha256sum] = "baa93f47f76281b4b73c07f097dce334a8975ca9be5c28bb14833253ecba57c7"

S = "${WORKDIR}/git"

inherit allarch

do_compile() {
        :
}
do_install() {
        install -d ${D}${base_libdir}/firmware
        install -m 0644 ${WORKDIR}/carl9170-1.fw ${D}${base_libdir}/firmware
}

FILES_${PN} = "${base_libdir}/firmware"
