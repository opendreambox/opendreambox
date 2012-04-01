require recipes/dreambox/dreambox-dvb-modules.inc

PR = "${INC_PR}.0"

SRC_URI[modules.md5sum] = "df28cdf08f307f322127c5843950fc6e"
SRC_URI[modules.sha256sum] = "db86a23580d394d02c4945d406184275f1a03226b5b7ae2b6faca44c61ae2720"

FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"
