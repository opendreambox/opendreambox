SUMMARY = "Fast and convenient service resolution converter"
LICENSE = "DreamProperty"
LIC_FILES_CHKSUM = "file://ServiceResolution.py;beginline=10;endline=19;md5=384c94124d631341cc698c887fe64ed3"
SRCREV = "${@opendreambox_srcrev('21a1ca8e1a50154a3023e3192fc8aaeb327681d8', d)}"
PV = "4.3.2"

inherit autotools opendreambox-github

require enigma2-plugin.inc

GITHUB_PROJECT = "enigma2-skincomponent-serviceresolution"
