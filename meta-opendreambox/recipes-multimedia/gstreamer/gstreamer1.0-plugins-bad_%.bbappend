FILESEXTRAPATHS_prepend := "${THISDIR}/${BPN}:"

SRC_URI += " \
    file://dvdspu-overlay-composition.patch \
    file://dvdspu-forced-mode-property.patch \
    file://assrender-overlay-caps.patch \
    file://rtmpsrc-interruption.patch \
"

EXTRA_OECONF += "--disable-dvb"
