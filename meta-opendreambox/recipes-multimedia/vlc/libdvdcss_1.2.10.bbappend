PR .= "-opt1"

SRC_URI += "file://use-cached-reads.patch"

FILESEXTRAPATHS_prepend := "${THISDIR}/${P}:"
