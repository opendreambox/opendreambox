DEPENDS += "cdparanoia orc orc-native"
PR .= "-dream1"

EXTRA_OECONF += "--enable-orc"

FILESEXTRAPATHS_prepend := "${THISDIR}/${P}:"
