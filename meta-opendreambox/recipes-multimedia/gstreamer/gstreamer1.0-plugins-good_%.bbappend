FILESEXTRAPATHS_prepend := "${THISDIR}/${BPN}:"

SRC_URI += "file://matroska-forced-tracks.patch \
	file://streamid.patch \
"
