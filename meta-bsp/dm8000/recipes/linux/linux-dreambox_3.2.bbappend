FILESEXTRAPATHS_prepend := "${THISDIR}/${P}:"

PR .= "-bsp1"

SRC_URI += "file://0001-disable-broken-brcm-shared-uart-irq-support-for-bcm7.patch"
