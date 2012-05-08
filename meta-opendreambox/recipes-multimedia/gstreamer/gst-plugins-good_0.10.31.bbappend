DEPENDS := "${@oe_filter_out('^(gconf|pulseaudio)$', '${DEPENDS}', d)}"
PR .= "-dream2"

SRC_URI += "file://audioparser-raise-ranks.patch \
            file://orc.m4-fix-location-of-orcc-when-cross-compiling.patch"

EXTRA_OECONF += "--enable-orc"

FILESEXTRAPATHS_prepend := "${THISDIR}/${P}:"
