include recipes-multimedia/gstreamer/gstreamer1.0-plugins-ugly.inc

LIC_FILES_CHKSUM = "file://COPYING;md5=a6f89e2100d9b6cdffcea4f398e37343 \
                    file://tests/check/elements/xingmux.c;beginline=1;endline=21;md5=4c771b8af188724855cb99cadd390068 "

SRC_URI += " \
    file://use-automake-1.12.patch \
"

SRC_URI[md5sum] = "1acdb29ede2e72bed4e7c6714a6aac5c"
SRC_URI[sha256sum] = "b470b9bdffb0f81b45a02f2e3c8f42b64acb548d68ad219b7e93296101a4146a"

S = "${WORKDIR}/gst-plugins-ugly-${PV}"

