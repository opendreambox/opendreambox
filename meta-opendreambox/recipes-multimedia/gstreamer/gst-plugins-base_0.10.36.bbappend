DEPENDS += "cdparanoia orc orc-native"
PR .= "-dream2"

EXTRA_OECONF += "--enable-orc"

FILESEXTRAPATHS_prepend := "${THISDIR}/${P}:"
