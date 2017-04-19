SUMMARY = "Control your dreambox with only the MUTE button"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://src/plugin.py;beginline=4;endline=24;md5=6b155b61cb25c839d80edc36a2a2fc4e"
SRCREV = "4bf475db2fd8e189e25fe2a166187eab03062fdb"
PV = "4.4+git${SRCPV}"

GITHUB_PROJECT = "enigma2-plugin-babelzapper"

inherit autotools opendreambox-github

require enigma2-plugin.inc
