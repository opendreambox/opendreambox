include recipes-multimedia/gstreamer/gstreamer1.0-plugins-base.inc

LIC_FILES_CHKSUM = "file://COPYING;md5=c54ce9345727175ff66d17b67ff51f58 \
                    file://common/coverage/coverage-report.pl;beginline=2;endline=17;md5=a4e1830fce078028c8f0974161272607 \
                    file://COPYING.LIB;md5=6762ed442b3822387a51c92d928ead0d \
                   "

DEPENDS += " iso-codes "

SRC_URI += " \
    file://use-automake-1.12.patch \
    file://gstbasetextoverlay-overlaycaps.patch \
    file://gsttextoverlay-timestamps.patch \
"

SRC_URI[md5sum] = "46aa49cae3d29508f37919817bd1e020"
SRC_URI[sha256sum] = "7a193e2a66b0d7411160ef2a373184c8aa3cdeaa576fa270be346716220d9606"

S = "${WORKDIR}/gst-plugins-base-${PV}"

EXTRA_OECONF += " \
    --enable-zlib \
"

