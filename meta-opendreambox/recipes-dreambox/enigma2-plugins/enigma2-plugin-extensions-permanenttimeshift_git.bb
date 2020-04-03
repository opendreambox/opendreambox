SUMMARY = "Permanent Timeshift"
LICENSE = "(CC-BY-NC-SA-3.0 | DreamProperty) & GPLv2+"
LIC_FILES_CHKSUM = "file://src/LICENSE;md5=236b9168db29523f262e097a72837597 \
                    file://src/createapscfiles/createapscfiles.cc;endline=12;md5=ee269abb4b18f5f29884937124fb9565"
SRCREV = "${@opendreambox_srcrev('521209ccb3264eecbaad36ceede6fcda83dd2984', d)}"
PV = "4.4.1"

inherit autotools-brokensep opendreambox-github

require enigma2-plugin-cpp.inc

GITHUB_PROJECT = "enigma2-plugin-permanenttimeshift"
