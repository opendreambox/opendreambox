FILESEXTRAPATHS_prepend := "${THISDIR}/${P}:"

PR .= "-bsp2"

SRC_URI += " \
	file://0001-disable-broken-brcm-shared-uart-irq-support-for-bcm7.patch \
	file://0001-dreambox_nand.c-dm8000-nand-removed-unneeded-readb-s.patch \
	file://0002-dreambox_nand.c-dm8000-speedup-flash-read-a-bit.patch \
"

