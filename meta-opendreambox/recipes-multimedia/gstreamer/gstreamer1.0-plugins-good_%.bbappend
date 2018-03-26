FILESEXTRAPATHS_prepend := "${THISDIR}/${BPN}:"

SRC_URI += "file://matroska-forced-tracks.patch \
            file://0001-udpsrc-add-support-for-IGMPv3-SSM.patch \
            file://0002-matroskademux-make-stream-id-more-readable-and-order.patch \
            file://0003-rtspsrc-always-send-teardown-request.patch \
"
