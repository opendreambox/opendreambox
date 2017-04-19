SUMMARY = "Shows average bitrate of video and audio"
LICENSE = "CC-BY-NC-SA-3.0 | DreamProperty"
LIC_FILES_CHKSUM = "file://src/plugin.py;beginline=5;endline=21;md5=c1a4ac5f6bd845cc16cccbe2a510092c"
SRCREV = "${@opendreambox_srcrev('9573494b3eeacb77554864a80ab77d0a4fc1f17a', d)}"
DEPENDS = "openssl"
PV = "4.3.1+git${SRCPV}"

inherit autotools opendreambox-github

require enigma2-plugin-cpp.inc

GITHUB_PROJECT = "enigma2-plugin-bitrateviewer"
