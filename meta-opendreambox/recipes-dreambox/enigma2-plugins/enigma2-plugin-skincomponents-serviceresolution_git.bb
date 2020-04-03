SUMMARY = "Fast and convenient service resolution converter"
LICENSE = "DreamProperty"
LIC_FILES_CHKSUM = "file://ServiceResolution.py;beginline=10;endline=19;md5=384c94124d631341cc698c887fe64ed3"
SRCREV = "${@opendreambox_srcrev('6c7b9711d3635111b5f1ae6cbccdc25c85a8f1a0', d)}"
PV = "4.4.1"

inherit autotools opendreambox-github

require enigma2-plugin.inc

GITHUB_PROJECT = "enigma2-skincomponent-serviceresolution"
