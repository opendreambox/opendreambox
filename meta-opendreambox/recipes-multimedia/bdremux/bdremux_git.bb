DESCRIPTION = "bdremux - a blu-ray movie stream remuxer"
SECTION = "multimedia"
PRIORITY = "optional"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=374d7e305a3d05bc98bec47c241f02af"
DEPENDS = "gstreamer gst-plugins-base"

SRCREV = "6b687071f087ff04a876580ca50dc459ae22106d"

inherit autotools opendreambox-git
