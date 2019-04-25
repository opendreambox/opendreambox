SUMMARY = "Eventlist Converter and Renderer to display n events and primetime"
LICENSE = "DreamProperty"
LIC_FILES_CHKSUM = "file://EventList.py;beginline=8;endline=21;md5=d5c1836fd7c355c994e00d27c332b9a4 \
                    file://EventListDisplay.py;beginline=8;endline=21;md5=d5c1836fd7c355c994e00d27c332b9a4"
SRCREV = "${@opendreambox_srcrev('573dfb832da40f6e953ac50a1a2d8b7737939e4b', d)}"
PV = "4.4.1"

inherit autotools opendreambox-github

require enigma2-plugin.inc

GITHUB_PROJECT = "enigma2-skincomponent-eventlist"
