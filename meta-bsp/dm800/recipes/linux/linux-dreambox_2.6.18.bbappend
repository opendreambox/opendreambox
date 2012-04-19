FILESEXTRAPATHS_prepend := "${THISDIR}/${P}:"

PR .= "-bsp3"

SRC_URI += "\
        file://linux-2.6.18-fix-serial.patch \
        file://stblinux-2.6.18-hw-ecc-compatibility.patch \
"
