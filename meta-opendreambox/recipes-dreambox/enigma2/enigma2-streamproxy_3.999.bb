SUMMARY = "streamproxy manages streaming data to a PC using enigma2"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=59530bdf33659b29e73d4adb9f9f6552"
SRCREV = "37a3f198a22d90cdfebf07cf56409cf93a4e74ba"
PR = "r4"

SRC_URI = "file://streamproxy.xinetd.in \
           file://streamproxy@.service \
           file://streamproxy.socket"

SCHWERKRAFT_PROJECT = "streamproxy"

inherit autotools schwerkraft-git systemd xinetd

do_install_append() {
        install -d ${D}${systemd_unitdir}/system
        ln -sf /dev/null ${D}${systemd_unitdir}/system/streamproxy.service
}

SYSTEMD_PACKAGES = "${PN}-systemd"
SYSTEMD_SERVICE_${PN}-systemd = "streamproxy.socket"

XINETD_PACKAGES = "${PN}-xinetd"
XINETD_SERVICE_${PN}-xinetd = "streamproxy"
