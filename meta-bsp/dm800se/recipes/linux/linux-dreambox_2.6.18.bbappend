FILESEXTRAPATHS_prepend := "${THISDIR}/${P}:"

PR .= "-bsp2"

SRC_URI += "\
        file://linux-2.6.18-fix-serial.patch \
        file://linux-2.6.18-swap-sata-ports.patch \
        file://stblinux-2.6.18-hw-ecc-compatibility.patch \
"
