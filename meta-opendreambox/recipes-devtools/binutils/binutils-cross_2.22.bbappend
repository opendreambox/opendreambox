PR .= "-dream1"

SRC_URI += "file://texinfo.patch"

FILESEXTRAPATHS_prepend := "${THISDIR}/binutils-${PV}:"
