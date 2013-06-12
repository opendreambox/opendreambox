FILESEXTRAPATHS_prepend := "${THISDIR}/${P}:"

SRC_URI += "\
        file://linux-2.6.18-fix-serial.patch \
        file://stblinux-2.6.18-hw-ecc-compatibility.patch \
"
