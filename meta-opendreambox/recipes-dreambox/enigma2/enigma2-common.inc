SUMMARY = "Framebuffer-based digital media application"
LICENSE = "Proprietary"

PACKAGES += "${PN}-meta"

RDEPENDS_${PN} += " \
        alsa-conf \
        glibc-gconv-iso8859-15 \
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
"

# Qt won't start without this fonts directory.
do_install_append() {
        install -d ${D}${libdir}/fonts
}

FILES_${PN} += "${datadir}/fonts ${datadir}/keymaps ${libdir}/fonts ${libdir}/libopen.so"
FILES_${PN}-meta = "${datadir}/meta"

require enigma2-core-plugins.inc
