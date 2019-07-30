FILESEXTRAPATHS_prepend := "${THISDIR}/${BPN}:"

SRC_URI += " \
    file://GstStreamFlags-forced.patch \
    file://fixed-queue2-memory-leak.patch \
"
