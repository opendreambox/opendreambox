SUMMARY = "Remote Timer and Remote TV Player"
LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://src/plugin.py;beginline=5;endline=18;md5=6ed4ecaaef16f19b151f0f1cfb154d33"
SRCREV = "${@opendreambox_srcrev('e001698232e047ecdd05198101db8ffc190545e9', d)}"
PV = "4.4.3"

inherit autotools-brokensep opendreambox-github

RDEPENDS_${PN} = "python-twisted-web"

require enigma2-plugin-cpp.inc

GITHUB_PROJECT = "enigma2-plugin-partnerbox"
