SUMMARY = "Dreambox Plugin Translations"
LICENSE = "CLOSED"
SRCREV = "${@opendreambox_srcrev('41b7f973a2337a94962c592b01ffd8b6e49b6440', d)}"
PV = "4.3.2.1+git${SRCPV}"

GITHUB_PROJECT = "enigma2-plugins-po"

inherit autotools gettext opendreambox-github

FILES_${PN} = "${datadir}/enigma2/po"
