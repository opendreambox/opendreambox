PR .= "-dream2"

SRC_URI += "file://Fix-Texinfo-usage-issues.patch"

FILESEXTRAPATHS_prepend := "${THISDIR}/gdb-${PV}:"

EXPAT = "--without-expat"
