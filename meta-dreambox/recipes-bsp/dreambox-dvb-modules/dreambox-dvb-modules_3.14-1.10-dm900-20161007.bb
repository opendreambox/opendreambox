require recipes-bsp/dreambox-dvb-modules/dreambox-dvb-modules.inc

SRC_URI[dm900.md5sum] = "0b2b7837a776878e5f244afba267b169"
SRC_URI[dm900.sha256sum] = "4f11da7e6fdf474adbf8019f2fdb48ff2f252de1ee5bce583d8cd36a7156db88"

do_install_append() {
    rm ${D}/lib/modules/${DM_LOCALVERSION}/extra/lcd.ko
    rm ${D}${sysconfdir}/modules-load.d/02-${BPN}-lcd.conf
}

COMPATIBLE_MACHINE = "^(dm900)$"
