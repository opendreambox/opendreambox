PRINC := "${@int(PRINC) + 1}"

SRC_URI += "file://busybox-telnetd.xinetd.in \
            file://busybox-telnetd@.service \
            file://busybox-telnetd.socket \
            file://0002-ifplugd-move-read_pid-to-libbb-pidfile.c-and-rename-.patch \
            file://0003-ifupdown-dhcp_down-wait-until-udhcpc-has-been-killed.patch \
            file://0004-udhcpc-calculate-broadcast-address-if-not-given-by-s.patch \
            file://0005-udhcpc-obtain-hostname-from-OS-by-default.patch"

inherit systemd xinetd

do_install_append() {
        if grep -q "CONFIG_CRONTAB=y" ${WORKDIR}/defconfig; then
                install -d ${D}${sysconfdir}/cron/crontabs
        fi
        install -d ${D}${systemd_unitdir}/system
        ln -sf /dev/null ${D}${systemd_unitdir}/system/busybox-telnetd.service
}

FILESEXTRAPATHS_prepend := "${THISDIR}/${P}:"

SYSTEMD_PACKAGES += "${PN}-systemd"
SYSTEMD_SERVICE_${PN}-systemd = "busybox-telnetd.socket"

XINETD_PACKAGES = "${PN}-xinetd"
XINETD_SERVICE_${PN}-xinetd = "busybox-telnetd"
