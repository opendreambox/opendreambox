DESCRIPTION = "Fake locale support"
LICENSE = "CLOSED"
SECTION = "base"
PRIORITY = "required"
PR = "r2"

SRC_URI = "http://sources.dreamboxupdate.com/download/opendreambox/fakelocale.tar.gz file://locale.alias"
SRC_URI[md5sum] = "d11a901c9e4dc2947cbc560044de2b67"
SRC_URI[sha256sum] = "b424804aff7a23efaa1fa25d27a55ac25173d0e7e95d07fe31096250bb498cc6"

S = "${WORKDIR}/fakelocale"

inherit allarch

LOCALEDIR = "${libdir}/locale"
LOCALEDIR2 = "/usr/share/locale"

LANGUAGES = "ar_AE cs_CZ da_DK de_DE el_GR es_ES et_EE fi_FI fr_FR fy_FY hr_HR \
	hu_HU is_IS it_IT lt_LT nl_NL no_NO pl_PL pt_PT ro_RO ru_RU sk_SK sl_SI \
	sr_YU sv_SE tr_TR ur_IN"

RPROVIDES = "virtual-locale-ar virtual-locale-cs virtual-locale-da \
	virtual-locale-de virtual-locale-el virtual-locale-es virtual-locale-et \
	virtual-locale-fi virtual-locale-fr virtual-locale-fy virtual-locale-hr \
	virtual-locale-hu virtual-locale-is virtual-locale-it virtual-locale-lt \
	virtual-locale-nl virtual-locale-no virtual-locale-pl virtual-locale-pt \
	virtual-locale-ro virtual-locale-ru virtual-locale-sk virtual-locale-sl \
	virtual-locale-sr virtual-locale-sv virtual-locale-tr virtual-locale-ur"

LOCALE_FILES = " LC_TIME LC_TELEPHONE LC_PAPER LC_NUMERIC LC_NAME LC_MONETARY LC_MESSAGES/SYS_LC_MESSAGES LC_MEASUREMENT \
	LC_IDENTIFICATION LC_CTYPE LC_COLLATE LC_ADDRESS"

do_install() {
	install -d ${D}${LOCALEDIR}/fake/LC_MESSAGES
	install -d ${D}${LOCALEDIR2}

	for x in ${LOCALE_FILES}; do
		install ${S}/$x ${D}${LOCALEDIR}/fake/$x
	done
	
	for lang in ${LANGUAGES}; do
		ln -s fake ${D}${LOCALEDIR}/${lang}
	done

	install ${WORKDIR}/locale.alias ${D}${LOCALEDIR2}
}

FILES_${PN} = "${LOCALEDIR} ${LOCALEDIR2}"
