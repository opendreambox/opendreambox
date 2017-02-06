FILESEXTRAPATHS_prepend := "${THISDIR}/${BPN}:"

SRC_URI += "file://matroska-forced-tracks.patch \
            file://streamid.patch \
            file://0001-udpsrc-add-support-for-IGMPv3-SSM.patch"
