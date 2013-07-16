PR .= "-dream0"

EXTRA_OECONF := "${@oe_filter_out('^(--without-ca-certificates)$', '${EXTRA_OECONF}', d)} --with-ca-certificates=${sysconfdir}/ssl/certs/ca-certificates.crt"
