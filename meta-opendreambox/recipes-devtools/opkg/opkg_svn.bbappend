PR .= "-dream1"

SRC_URI += "file://0001-Fixed-opkg-losing-auto_installed-flag-on-upgrading.patch"

FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"
