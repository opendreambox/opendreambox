LICENSE = "LGPLv2.1+"
DEPENDS := "${@oe_filter_out('^(libvpx|x264)$', '${DEPENDS}', d)}"

EXTRA_OECONF += "--disable-gpl --disable-libvpx --disable-libx264 --disable-nonfree --disable-version3 --disable-x11grab"
