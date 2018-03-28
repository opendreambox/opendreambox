SUMMARY = "Priorities 4 Timers by psy-co"
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://src/plugin.py;beginline=3;endline=21;md5=50ed3c5b628a5557b6be3aa3e8b45dbc"

GITHUB_PROJECT = "enigma2-plugin-pzyp4t"

SRCREV = "${@opendreambox_srcrev('cd10669da3a7a14a4949eca93fe04010a20e0f6d', d)}"

inherit autotools opendreambox-github

require enigma2-plugin.inc
