SUMMARY = "Dreambox Plugin Translations"
LICENSE = "CLOSED"
SRCREV = "7170721b4ca38b6423f5fb69b18f81a4f84e0380"
PV = "4.3.2.1+git${SRCPV}"

GITHUB_PROJECT = "enigma2-plugins-po"

inherit autotools opendreambox-github

FILES_${PN} = "${datadir}/enigma2/po"
