SUMMARY = "OpenDreambox: CD-Player Task for the OpenDreambox Distribution"
SECTION = "opendreambox/base"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${OPENDREAMBOX_BASE}/LICENSE;md5=ed920ea8b6701825484d079e87a3a73a"

inherit packagegroup

#
# packagegroup-opendreambox-cdplayer
#
SUMMARY_${PN} = "OpenDreambox: CD-Player Support"
RDEPENDS_${PN} = "\
 cdfs \
 cdtextinfo \
 gstreamer1.0-plugins-ugly-cdio \
"

