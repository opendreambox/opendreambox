FILESEXTRAPATHS_prepend := "${THISDIR}/${P}:"

PR .= "-bsp1"

SRC_URI += " file://0001-add-support-for-toshiba-nand-flash-add-workaround-fo.patch"
