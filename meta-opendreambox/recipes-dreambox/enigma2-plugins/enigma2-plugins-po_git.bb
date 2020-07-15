SUMMARY = "Dreambox Plugin Translations"
LICENSE = "CLOSED"
SRCREV = "${@opendreambox_srcrev('6152cce472e4c8246bc42677d1924a33f835d9f3', d)}"
PV = "4.4.1+git${SRCPV}"

GITHUB_PROJECT = "enigma2-plugins-po"

inherit autotools gettext opendreambox-github

FILES_${PN} = "${datadir}/enigma2/po"
