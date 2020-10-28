SUMMARY = "Dreambox Plugin Translations"
LICENSE = "CLOSED"
SRCREV = "${@opendreambox_srcrev('281a4a7859eb93ef3b10e92b3ad6b37923bc7740', d)}"
PV = "4.4.2"

inherit autotools gettext opendreambox-github

FILES_${PN} = "${datadir}/enigma2/po"
