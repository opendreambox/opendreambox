DEPENDS += "libcdio"
PR .= "-dream2"

SRC_URI += "file://dvdsubdec-addproperty-singlebuffer.patch"

EXTRA_OECONF += "--enable-orc --with-plugins="

FILESEXTRAPATHS_prepend := "${THISDIR}/${P}:"
