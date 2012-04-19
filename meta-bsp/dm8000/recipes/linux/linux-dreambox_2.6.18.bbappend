FILESEXTRAPATHS_prepend := "${THISDIR}/${P}:"

PR .= "-bsp4"

SRC_URI += "\
        file://linux-2.6.18-disable-unneeded-uarts.patch \
        file://linux-2.6.18-use-full-flash.patch \
        file://linux-2.6.18-big-summary.patch \
        file://stblinux-2.6.18-hw-ecc-compatibility.patch \
"
