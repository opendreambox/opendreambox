require recipes/dreambox/dreambox-dvb-modules.inc

PR = "${INC_PR}.0"

SRC_URI[modules.md5sum] = "420e34b6aa3422f84aa7d59503a73bba"
SRC_URI[modules.sha256sum] = "bac84f90b85d51c38a9b9d349f03ea95222f1a34cf08bcd4cdf920f5a1586f7a"

FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"
