PR .= "-dream1"

SRC_URI += "file://compile-under-c++11.patch"

FILESEXTRAPATHS_prepend := "${THISDIR}/${P}:"
