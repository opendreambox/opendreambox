SUMMARY = "Dreambox Core Translations"
LICENSE = "CLOSED"
SRCREV = "${@opendreambox_srcrev('2e2edebc8d13f58338e9cba3690c3cb8cea69d5a', d)}"
PV = "4.5.1.1"

RBREAKS_${PN} = "enigma2 (< 4.5.1)"

inherit autotools gettext opendreambox-github

FILES_${PN} = "${datadir}/enigma2/po"
