SUMMARY = "Permanent Timeshift"
LICENSE = "(CC-BY-NC-SA-3.0 | DreamProperty) & GPLv2+"
LIC_FILES_CHKSUM = "file://src/LICENSE;md5=236b9168db29523f262e097a72837597 \
                    file://src/createapscfiles/createapscfiles.cc;endline=12;md5=ee269abb4b18f5f29884937124fb9565"
SRCREV = "${@opendreambox_srcrev('ec13e15b0053ef23f80cbac06d03a082c38debde', d)}"
PV = "4.4.3"

inherit autotools-brokensep opendreambox-github

require enigma2-plugin-cpp.inc

GITHUB_PROJECT = "enigma2-plugin-permanenttimeshift"
