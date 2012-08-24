DEPENDS += "cdparanoia orc orc-native"
PR .= "-dream3"

SRC_URI += "file://orc.m4-fix-location-of-orcc-when-cross-compiling.patch \
            file://disable-vorbis-encoder.patch"

EXTRA_OECONF += "--enable-orc"

FILESEXTRAPATHS_prepend := "${THISDIR}/${P}:"
