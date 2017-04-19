SUMMARY = "Remote Timer and Remote TV Player"
LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://src/plugin.py;beginline=5;endline=18;md5=0502f8225bcc4d079ef25e93c7c0ee20"
SRCREV = "${@opendreambox_srcrev('d6531d0a288d1590272cb1feac9eefd64c72292a', d)}"
PV = "4.3.1+git${SRCPV}"

inherit autotools-brokensep opendreambox-github

RDEPENDS_${PN} = "python-twisted-web"

require enigma2-plugin-cpp.inc

GITHUB_PROJECT = "enigma2-plugin-partnerbox"
