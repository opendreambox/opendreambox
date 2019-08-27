SUMMARY = "Dreambox Plugin Translations"
LICENSE = "CLOSED"
SRCREV = "${@opendreambox_srcrev('f964370f46a80d6df6e278969af35556a9a2622a', d)}"
PV = "4.4.1+git${SRCPV}"

GITHUB_PROJECT = "enigma2-plugins-po"

inherit autotools gettext opendreambox-github

FILES_${PN} = "${datadir}/enigma2/po"
