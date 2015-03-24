SUMMARY = "streamproxy manages streaming data to a PC using enigma2"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=59530bdf33659b29e73d4adb9f9f6552"
SRCREV = "${@opendreambox_srcrev('d9396c07f1ddfcbacec70350604fea0d3ccae821', d)}"

SRC_URI = "file://streamproxy.xinetd.in \
           file://streamproxy@.service \
           file://streamproxy.socket"

inherit autotools opendreambox-git systemd xinetd

do_install_append() {
        if ${@base_contains('DISTRO_FEATURES', 'systemd', 'true', 'false', d)}; then
                install -d ${D}${systemd_unitdir}/system
                ln -sf /dev/null ${D}${systemd_unitdir}/system/streamproxy.service
                install -m644 ${WORKDIR}/streamproxy@.service ${D}${systemd_unitdir}/system
                install -m644 ${WORKDIR}/streamproxy.socket ${D}${systemd_unitdir}/system
        fi
}

SYSTEMD_SERVICE_${PN} = "streamproxy.socket"
XINETD_SERVICE_${PN} = "streamproxy"
