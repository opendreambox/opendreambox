FILESEXTRAPATHS_prepend := "${THISDIR}/${BPN}:"

SRC_URI += " \
    file://gstbasetextoverlay-overlaycaps.patch \
    file://gsttextoverlay-timestamps.patch \
    file://alsasink-lower-rank.patch \
    file://fixed-warnings-caused-by-subtitle-overlay.patch \
    file://appsink-allow-eos-interruption.patch \
    file://appsink-backported-fixes.patch \
"
