SUMMARY = "OpenDreambox: DVD-Player Task for the OpenDreambox Distribution"
SECTION = "opendreambox/base"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${OPENDREAMBOX_BASE}/LICENSE;md5=0a5ec7423edaca24547634f416478834"
PR = "r3"

inherit packagegroup

#
# packagegroup-opendreambox-dvdplayer
#
SUMMARY_${PN} = "OpenDreambox: DVD-Player Support"
RDEPENDS_${PN} = "\
  kernel-module-udf \
  kernel-module-isofs \
"

PACKAGE_ARCH = "${MACHINE_ARCH}"
