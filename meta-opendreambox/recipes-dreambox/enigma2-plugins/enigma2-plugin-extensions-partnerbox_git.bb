SUMMARY = "Remote Timer and Remote TV Player"
LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://src/plugin.py;beginline=5;endline=18;md5=6ed4ecaaef16f19b151f0f1cfb154d33"
SRCREV = "${@opendreambox_srcrev('cdde6cc8854ed36072efa5294fbf6e485128947d', d)}"
PV = "4.3.2"

inherit autotools-brokensep opendreambox-github

RDEPENDS_${PN} = "python-twisted-web"

require enigma2-plugin-cpp.inc

GITHUB_PROJECT = "enigma2-plugin-partnerbox"
