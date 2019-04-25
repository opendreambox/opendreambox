SUMMARY = "Dreambox Plugin Translations"
LICENSE = "CLOSED"
SRCREV = "${@opendreambox_srcrev('31ab2b78bdd7133ef9353b34fb56caccaa9ea985', d)}"
PV = "4.4.1+git${SRCPV}"

GITHUB_PROJECT = "enigma2-plugins-po"

inherit autotools gettext opendreambox-github

FILES_${PN} = "${datadir}/enigma2/po"
