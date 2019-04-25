SUMMARY = "Stream videos from VLC to your dreambox"
LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://src/plugin.py;beginline=2;endline=10;md5=f55cd78ed9f5948ac8adb45fb9fa803a"
SRCREV = "${@opendreambox_srcrev('cd2c9f401b2a452f0cc9e2dc15ef6a8bdeb15aec', d)}"
PV = "4.4.1"

inherit autotools opendreambox-github

RDEPENDS_${PN} = " \
    python-netclient \
    python-xml \
"

require enigma2-plugin-cpp.inc

GITHUB_PROJECT = "enigma2-plugin-vlcplayer"
