SUMMARY = "Remote Timer and Remote TV Player"
LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://src/plugin.py;beginline=5;endline=18;md5=3b634f641fb0d4a1a8dbf77b312564d5"
SRCREV = "${@opendreambox_srcrev('742b5ad2c6763ac429b6c827ce9bca6b163e36e3', d)}"
PV = "4.3.2"

inherit autotools-brokensep opendreambox-github

RDEPENDS_${PN} = "python-twisted-web"

require enigma2-plugin-cpp.inc

GITHUB_PROJECT = "enigma2-plugin-partnerbox"
