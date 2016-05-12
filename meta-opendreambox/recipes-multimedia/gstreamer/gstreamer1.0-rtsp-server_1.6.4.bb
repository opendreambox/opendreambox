include recipes-multimedia/gstreamer/gstreamer1.0-rtsp-server.inc

LIC_FILES_CHKSUM = "file://COPYING;md5=6762ed442b3822387a51c92d928ead0d"

SRC_URI += " \
    file://use-automake-1.12.patch \
"

SRC_URI[md5sum] = "4734b3c94e9d785cbff884720a8c826f"
SRC_URI[sha256sum] = "5270545ff4b59a040e05f543a538b0a59327822895b637022beb4a36cc721672"

