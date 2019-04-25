SUMMARY = "EventPosition Converter using ePositionGauge for event data"
LICENSE = "DreamProperty"
LIC_FILES_CHKSUM = "file://EventPosition.py;beginline=8;endline=21;md5=d5c1836fd7c355c994e00d27c332b9a4"
SRCREV = "${@opendreambox_srcrev('ba6827e06c46715b2244ce71dd55ac40971f483b', d)}"
PV = "4.4.1"

inherit autotools opendreambox-github

require enigma2-plugin.inc

GITHUB_PROJECT = "enigma2-skincomponent-eventposition"
