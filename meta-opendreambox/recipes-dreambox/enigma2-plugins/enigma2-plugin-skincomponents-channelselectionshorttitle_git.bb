SUMMARY = "ChannelSelectionShortTitle Converter"
LICENSE = "DreamProperty"
LIC_FILES_CHKSUM = "file://ChannelSelectionShortTitle.py;beginline=7;endline=20;md5=d5c1836fd7c355c994e00d27c332b9a4"
SRCREV = "${@opendreambox_srcrev('3e0f8dafddeb77750a77bdcd7d06abf5766d81d6', d)}"
PV = "4.4.1"

inherit autotools opendreambox-github

require enigma2-plugin.inc

GITHUB_PROJECT = "enigma2-skincomponent-channelselectionshorttitle"
