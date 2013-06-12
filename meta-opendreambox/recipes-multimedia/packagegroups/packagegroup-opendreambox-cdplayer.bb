SUMMARY = "OpenDreambox: CD-Player Task for the OpenDreambox Distribution"
SECTION = "opendreambox/base"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${OPENDREAMBOX_BASE}/LICENSE;md5=0a5ec7423edaca24547634f416478834"

inherit packagegroup

#
# packagegroup-opendreambox-cdplayer
#
SUMMARY_${PN} = "OpenDreambox: CD-Player Support"
RDEPENDS_${PN} = "\
 cdfs \
 cdtextinfo \
 gst-plugins-ugly-cdio \
"

