SUMMARY = "OpenDreambox: DVB API v3 Task for the OpenDreambox Distribution"
SECTION = "opendreambox/base"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${OPENDREAMBOX_BASE}/LICENSE;md5=0a5ec7423edaca24547634f416478834"
PR = "r4"

inherit task

#
# task-opendreambox-dvbapi3
#
SUMMARY_${PN} = "OpenDreambox: DVB API v3 Dependencies"
RDEPENDS_${PN} = "\
  dvbsnoop \
  showiframe \
"

