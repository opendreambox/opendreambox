FILESEXTRAPATHS_prepend := "${THISDIR}/${BPN}:"

SRC_URI += " \
    file://dvdspu-dts-timestamps.patch \
    file://assrender-overlay-caps.patch \
"

EXTRA_OECONF += "--disable-dvb"
