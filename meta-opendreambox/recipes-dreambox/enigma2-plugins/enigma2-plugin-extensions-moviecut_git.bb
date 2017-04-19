SUMMARY = "Cut your movies"
DESCRIPTION = "Execute the cuts, as set by the CutlistEditor, by physically removing unwanted parts from the files."
LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://src_cc/mcut.cc;endline=17;md5=5d5282ff39cc0bb0948730abddf30c0c"
SRCREV = "${@opendreambox_srcrev('0ed2c2f483345014494aca0a37e323c64dd37087', d)}"
PV = "4.3.1+git${SRCPV}"

inherit autotools opendreambox-github

require enigma2-plugin.inc

GITHUB_PROJECT = "enigma2-plugin-moviecut"
