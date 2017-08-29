SUMMARY = "Dreambox Plugin Translations"
LICENSE = "CLOSED"
SRCREV = "ca77fd47e120fd085ed49fe4a2b834bf6ea8d4b6"
PV = "4.3.2.1+git${SRCPV}"

GITHUB_PROJECT = "enigma2-plugins-po"

inherit autotools opendreambox-github

FILES_${PN} = "${datadir}/enigma2/po"
