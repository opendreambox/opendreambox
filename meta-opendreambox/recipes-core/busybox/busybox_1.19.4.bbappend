PR .= "-dream6"

SRC_URI += "file://telnetd.xinetd.in \
            file://0001-ifupdown-backport-from-master.patch"

inherit xinetd

do_install_append() {
        if grep -q "CONFIG_CRONTAB=y" ${WORKDIR}/defconfig; then
                install -d ${D}${sysconfdir}/cron/crontabs
        fi
}

FILESEXTRAPATHS_prepend := "${THISDIR}/${P}:"
