FILESEXTRAPATHS_prepend := "${THISDIR}/${BPN}:"

SRC_URI += " \
    file://gstbasetextoverlay-overlaycaps.patch \
    file://gsttextoverlay-timestamps.patch \
"
