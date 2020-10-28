SUMMARY = "Dreambox Core Translations"
LICENSE = "CLOSED"
SRCREV = "${@opendreambox_srcrev('cfbd0c0b6e01b654bf2381ec4a217709c8ccdf6c', d)}"
PV = "4.5.1.1"

RBREAKS_${PN} = "enigma2 (< 4.5.1)"

inherit autotools gettext opendreambox-github

FILES_${PN} = "${datadir}/enigma2/po"
