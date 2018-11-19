SUMMARY = "Permanent Timeshift"
LICENSE = "(CC-BY-NC-SA-3.0 | DreamProperty) & GPLv2+"
LIC_FILES_CHKSUM = "file://src/LICENSE;md5=236b9168db29523f262e097a72837597 \
                    file://src/createapscfiles/createapscfiles.cc;endline=12;md5=ee269abb4b18f5f29884937124fb9565"
SRCREV = "${@opendreambox_srcrev('6c1ad7f3390d0effd3b13e0b2fe43002f3b100cb', d)}"
PV = "4.3.2"

inherit autotools-brokensep opendreambox-github

require enigma2-plugin-cpp.inc

GITHUB_PROJECT = "enigma2-plugin-permanenttimeshift"
