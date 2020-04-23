LICENSE = "CLOSED"

PACKAGE_ARCH = "${MACHINE_ARCH}"

SRC_URI = " file://${CURRENT_FW}"

RPROVIDES_${PN} += " nrf52-firmware"

do_compile() {
    :
}
do_install() {
    install -d ${D}/usr/share/nrf52-firmware
    install -m 644 ${S}/../${CURRENT_FW} ${D}/usr/share/nrf52-firmware
}

FILES_${PN} = "/usr/share/nrf52-firmware"
