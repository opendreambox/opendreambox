DEPENDS += "libmms"
PR .= "-dream4"

SRC_URI += " \
        file://0001-mpegtsdemux-fix-bd-streamtype-detection.diff.patch \
        file://0002-add-indexing-capabilities-to-generate-a-SPN-PTS-map-.patch \
        file://0003-mpegpsdemux_speedup.diff.patch \
        file://orc.m4-fix-location-of-orcc-when-cross-compiling.patch \
"

EXTRA_OECONF += "--enable-orc --with-plugins="
# fix "configure: error: cannot run test program while cross compiling"
EXTRA_OECONF += "--disable-mpeg2enc --disable-mplex"

FILESEXTRAPATHS_prepend := "${THISDIR}/${P}:"
