SUMMARY = "OpenDreambox: DVD-Player Task for the OpenDreambox Distribution"
SECTION = "opendreambox/base"
LICENSE = "MIT"

PACKAGE_ARCH = "${MACHINE_ARCH}"

inherit packagegroup

#
# packagegroup-opendreambox-dvdplayer
#
SUMMARY_${PN} = "OpenDreambox: DVD-Player Support"
RRECOMMENDS_${PN} = "\
  kernel-module-udf \
  kernel-module-isofs \
"
