FILESEXTRAPATHS_prepend := "${THISDIR}/${P}:"

PR .= "-bsp2"

SRC_URI += " file://0001-add-support-for-toshiba-nand-flash-add-workaround-fo.patch \
             file://0004-correctly-initiate-nand-flash-ecc-config-when-old-2n.patch"
