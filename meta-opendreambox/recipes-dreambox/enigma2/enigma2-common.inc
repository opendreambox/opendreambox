SUMMARY = "Framebuffer-based digital media application"
LICENSE = "Proprietary"
DEPENDS += "cdrkit dvdauthor dvd+rw-tools mjpegtools projectx python-imaging"

PACKAGES += "${PN}-meta"

RDEPENDS_${PN} += " \
        e2fsprogs-e2fsck \
        e2fsprogs-mke2fs \
        glibc-gconv-iso8859-15 \
        hdparm \
        python-codecs \
        python-core \
        python-crypt \
        python-fcntl \
        python-lang \
        python-netclient \
        python-netserver \
        python-pickle \
        python-re \
        python-shell \
        python-twisted-core \
        python-twisted-web \
        python-xml \
        python-zopeinterface \
        sdparm \
        util-linux-blkid \
        util-linux-sfdisk \
"

# Qt won't start without this fonts directory.
do_install_append() {
        install -d ${D}${libdir}/fonts
}

FILES_${PN} += "${datadir}/fonts ${datadir}/keymaps ${libdir}/fonts ${libdir}/libopen.so"
FILES_${PN}-dev = "${includedir} ${libdir}/*.la ${libdir}/pkgconfig"
FILES_${PN}-meta = "${datadir}/meta"

require enigma2-core-plugins.inc
