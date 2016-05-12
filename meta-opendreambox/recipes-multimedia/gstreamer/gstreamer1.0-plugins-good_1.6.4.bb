include recipes-multimedia/gstreamer/gstreamer1.0-plugins-good.inc

LIC_FILES_CHKSUM = "file://COPYING;md5=a6f89e2100d9b6cdffcea4f398e37343 \
                    file://common/coverage/coverage-report.pl;beginline=2;endline=17;md5=a4e1830fce078028c8f0974161272607 \
                    file://gst/replaygain/rganalysis.c;beginline=1;endline=23;md5=b60ebefd5b2f5a8e0cab6bfee391a5fe"

SRC_URI += " \
    file://use-automake-1.12.patch \
    file://matroska-forced-tracks.patch \
"

SRC_URI[md5sum] = "49faec96efd963483b9b32be10f59841"
SRC_URI[sha256sum] = "6915335458d0421d30d2545f85cc4d891d10d48f2be8dc1bd8f45e38b8f64a9c"

S = "${WORKDIR}/gst-plugins-good-${PV}"
