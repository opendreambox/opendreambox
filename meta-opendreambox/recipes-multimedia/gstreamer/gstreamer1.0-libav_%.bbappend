FILESEXTRAPATHS_prepend := "${THISDIR}/${BPN}:"

SRC_URI += " \
    file://0001-lower-rank-for-broken-aac-dec.patch \
"

LIBAV_EXTRA_CONFIGURE_COMMON_ARG += "--disable-mipsdspr1 --disable-mipsdspr2"
