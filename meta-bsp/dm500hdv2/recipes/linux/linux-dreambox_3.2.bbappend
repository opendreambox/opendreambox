FILESEXTRAPATHS_prepend := "${THISDIR}/${P}:"

PR .= "-bsp1"

SRC_URI += " file://0001-add-support-for-DM800SEv2-and-DM500HDv2-simplified-1.patch \
             file://0001-add-support-for-toshiba-nand-flash-add-workaround-fo.patch"
