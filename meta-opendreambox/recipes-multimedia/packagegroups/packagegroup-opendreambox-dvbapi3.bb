SUMMARY = "OpenDreambox: DVB API v3 Task for the OpenDreambox Distribution"
SECTION = "opendreambox/base"
LICENSE = "MIT"

inherit packagegroup

#
# packagegroup-opendreambox-dvbapi3
#
SUMMARY_${PN} = "OpenDreambox: DVB API v3 Dependencies"
RDEPENDS_${PN} = "\
  dvbsnoop \
  showiframe \
"

