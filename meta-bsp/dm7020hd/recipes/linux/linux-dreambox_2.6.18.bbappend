FILESEXTRAPATHS_prepend := "${THISDIR}/${P}:"

PR .= "-bsp3"

SRC_URI += "\
        file://linux-2.6.18-fix-serial.patch \
        file://linux-2.6.18-256MB-nand-support.patch \
        file://linux-2.6.18-big-summary.patch \
"
