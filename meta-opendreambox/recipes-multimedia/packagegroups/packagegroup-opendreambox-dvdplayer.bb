SUMMARY = "OpenDreambox: DVD-Player Task for the OpenDreambox Distribution"
SECTION = "opendreambox/base"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${OPENDREAMBOX_BASE}/LICENSE;md5=ed920ea8b6701825484d079e87a3a73a"

PACKAGE_ARCH = "${MACHINE_ARCH}"

inherit packagegroup

#
# packagegroup-opendreambox-dvdplayer
#
SUMMARY_${PN} = "OpenDreambox: DVD-Player Support"
RDEPENDS_${PN} = "\
  kernel-module-udf \
  kernel-module-isofs \
"
