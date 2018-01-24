SUMMARY = "Remote Timer and Remote TV Player"
LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://src/plugin.py;beginline=5;endline=18;md5=6ed4ecaaef16f19b151f0f1cfb154d33"
SRCREV = "${@opendreambox_srcrev('09f3d5df11e170f317c138c62e8c987c7800c541', d)}"
PV = "4.3.2"

inherit autotools-brokensep opendreambox-github

RDEPENDS_${PN} = "python-twisted-web"

require enigma2-plugin-cpp.inc

GITHUB_PROJECT = "enigma2-plugin-partnerbox"
