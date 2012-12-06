PR .= "-dream0"

FILESEXTRAPATHS_prepend := "${THISDIR}/${P}:"

SRC_URI += " file://libaio-fix-mips-ret-codes.patch"
