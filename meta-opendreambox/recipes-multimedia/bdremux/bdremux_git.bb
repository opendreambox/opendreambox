SUMMARY = "bdremux - a blu-ray movie stream remuxer"
SECTION = "multimedia"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=374d7e305a3d05bc98bec47c241f02af"
DEPENDS = "gstreamer1.0"
SRCREV = "${@opendreambox_srcrev('96606cc6f4961526e9141f59e7e8e80e694dfe35', d)}"

OPENDREAMBOX_URI_append = ";branch=gst_1.0"

inherit autotools opendreambox-git pkgconfig
