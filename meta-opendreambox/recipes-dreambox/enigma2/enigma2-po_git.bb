SUMMARY = "Dreambox Core Translations"
LICENSE = "CLOSED"
SRCREV = "${@opendreambox_srcrev('db0268b54cb3f1640ac45bd2bcb002a3b7d742b4', d)}"
PV = "4.5.1+git${SRCPV}"

RBREAKS_${PN} = "enigma2 (< 4.5.1)"

inherit autotools gettext opendreambox-github

FILES_${PN} = "${datadir}/enigma2/po"