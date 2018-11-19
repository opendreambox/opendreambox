SUMMARY = "Dreambox Plugin Translations"
LICENSE = "CLOSED"
SRCREV = "${@opendreambox_srcrev('1d44349725a2b9cd61503cf3b82a5cd2731d5d5b', d)}"
PV = "4.3.2.1+git${SRCPV}"

GITHUB_PROJECT = "enigma2-plugins-po"

inherit autotools gettext opendreambox-github

FILES_${PN} = "${datadir}/enigma2/po"
