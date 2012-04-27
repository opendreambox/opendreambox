PR .= "-dream7"

SRC_URI += "file://telnetd.xinetd.in \
            file://0001-ifupdown-support-post-up-pre-down-hooks.patch \
            file://0002-ifupdown-code-shrink.patch \
            file://0003-ifupdown-remove-interface-from-state_list-if-iface_u.patch \
            file://0004-ifupdown-support-metric-for-static-default-gw.patch \
            file://0005-ifupdown-improve-compatibility-with-Debian.patch \
            file://0006-get_linux_version_code-don-t-fail-on-3.0-foo.patch"

inherit xinetd

do_install_append() {
        if grep -q "CONFIG_CRONTAB=y" ${WORKDIR}/defconfig; then
                install -d ${D}${sysconfdir}/cron/crontabs
        fi
}

FILESEXTRAPATHS_prepend := "${THISDIR}/${P}:"
