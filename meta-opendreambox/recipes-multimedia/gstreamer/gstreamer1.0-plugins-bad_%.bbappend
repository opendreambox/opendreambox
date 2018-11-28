FILESEXTRAPATHS_prepend := "${THISDIR}/${BPN}:"

SRC_URI += " \
    file://0001-Revert-dvdspu-Handle-vob-display-rect-starting-on-an.patch \
    file://0002-Revert-dvdspu-don-t-crash-if-video-frame-could-not-b.patch \
    file://0003-Revert-Revert-dvdspu-render-to-AYUV-overlay.patch \
    file://0004-Revert-Revert-dvdspu-render-to-ARGB-overlay-instead-.patch \
    file://0005-Revert-Revert-dvdspu-handle-frame-size-event-from-up.patch \
    file://0006-Revert-Revert-dvdspu-cache-overlay-composition.patch \
    file://0007-Revert-Revert-dvdspu-improve-negotiation-of-overlay-.patch \
    file://dvdspu-dts-timestamps.patch \
    file://assrender-overlay-caps.patch \
    file://dvdspu-forced-mode-property.patch \
    file://rtmpsrc-interruption.patch \
"

EXTRA_OECONF += "--disable-dvb"

