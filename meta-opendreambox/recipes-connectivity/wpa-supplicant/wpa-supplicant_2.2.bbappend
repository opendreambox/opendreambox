do_configure_append() {
        sed -e '/^CONFIG_TLS = gnutls/d' -i wpa_supplicant/.config
        echo "CONFIG_DEBUG_SYSLOG=y" >> wpa_supplicant/.config
}
