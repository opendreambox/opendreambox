DESCRIPTION = "OpenDreambox: DVD-Player Task for the OpenDreambox Distribution"
SECTION = "opendreambox/base"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${OPENDREAMBOX_BASE}/LICENSE;md5=0a5ec7423edaca24547634f416478834"
PR = "r1"

inherit task

#
# task-opendreambox-dvdplayer
#
DESCRIPTION_${PN} = "OpenDreambox: DVD-Player Support"
DEPENDS = "enigma2"
RDEPENDS_${PN} = "\
  kernel-module-udf \
  kernel-module-isofs \
  enigma2-plugin-extensions-dvdplayer \
"

PACKAGE_ARCH = "${MACHINE_ARCH}"
