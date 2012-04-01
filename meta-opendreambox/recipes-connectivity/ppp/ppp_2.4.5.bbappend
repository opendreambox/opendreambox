PR .= "-dream1"

do_install_append() {
	rm ${D}/${sysconfdir}/ppp/options
	rm ${D}/${sysconfdir}/ppp/pap-secrets
}

CONFFILES_${PN} = "${sysconfdir}/ppp/chap-secrets"
