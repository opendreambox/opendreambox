SUMMARY = "Converter to convert service reference to the format expected by the renderer Picon"
LICENSE = "DreamProperty"
LIC_FILES_CHKSUM = "file://RefToPiconName.py;beginline=8;endline=21;md5=d5c1836fd7c355c994e00d27c332b9a4"
SRCREV = "${@opendreambox_srcrev('2e4debf6a388f98d9fb7e0d032967b4ad78a0d54', d)}"
PV = "4.3.2"

inherit autotools opendreambox-github

require enigma2-plugin.inc

GITHUB_PROJECT = "enigma2-skincomponent-reftopiconname"
