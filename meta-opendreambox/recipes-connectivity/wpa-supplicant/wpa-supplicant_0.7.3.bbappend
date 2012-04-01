DEPENDS += "openssl"
PR .= "-dream1"

do_configure_append() {
        sed -e '/^CONFIG_TLS = gnutls/d' -i .config
}
