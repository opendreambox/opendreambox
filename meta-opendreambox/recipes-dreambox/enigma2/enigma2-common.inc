SUMMARY = "Framebuffer-based digital media application"
LICENSE = "Proprietary"

SYSTEMD_SERVICE_${PN} = "enigma2.service"

inherit systemd

# Qt won't start without this fonts directory.
do_install_append() {
    install -d ${D}${libdir}/fonts
}

PACKAGES += "${PN}-meta"

RDEPENDS_${PN} += " \
        cdfs \
        e2fsprogs-e2fsck \
        e2fsprogs-mke2fs \
        enigma2-autofs \
        hdparm \
        libpagecache \
        python-argparse \
        python-codecs \
        python-core \
        python-crypt \
        python-ctypes \
        python-dbus \
        python-fcntl \
        python-importlib \
        python-ioctl \
        python-lang \
        python-monotonic \
        python-netaddr \
        python-netclient \
        python-netserver \
        python-pickle \
        python-re \
        python-shell \
        python-subprocess \
        python-twisted-core \
        python-twisted-web \
        python-xml \
        python-zopeinterface \
        sdparm \
        util-linux-blkid \
        util-linux-sfdisk \
"
RDEPENDS_${PN}_append_libc-glibc = " \
        glibc-gconv-iso8859-15 \
"
RRECOMMENDS_${PN} += " \
        enigma2-journald \
"

FILES_${PN} += "${datadir}/fonts ${datadir}/keymaps ${libdir}/fonts ${libdir}/libopen.so"
FILES_${PN}-dev = "${includedir} ${libdir}/*.la ${libdir}/pkgconfig"
FILES_${PN}-meta = "${datadir}/meta"

require enigma2-core-plugins.inc

# Override systemd_postinst from systemd.bbclass to replace 'restart' with 'start'.
systemd_postinst() {
OPTS=""
if [ -n "$D" ]; then
    OPTS="--root=$D"
fi
if type systemctl >/dev/null 2>/dev/null; then
    systemctl $OPTS ${SYSTEMD_AUTO_ENABLE} ${SYSTEMD_SERVICE}
    if [ -z "$D" -a "${SYSTEMD_AUTO_ENABLE}" = "enable" ]; then
        systemctl start ${SYSTEMD_SERVICE}
    fi
fi
}
