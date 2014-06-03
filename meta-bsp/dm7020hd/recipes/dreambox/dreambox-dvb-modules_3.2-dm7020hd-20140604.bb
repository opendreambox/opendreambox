require recipes/dreambox/dreambox-dvb-modules.inc

PR = "${INC_PR}.0"

SRC_URI[modules.md5sum] = "b2958f1fd737f697be3e2fcf951f0d6b"
SRC_URI[modules.sha256sum] = "442e914f21ad56164be593c469f876f29dc10dc20cdfa6af790fdf5b8677a4e9"

FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"
