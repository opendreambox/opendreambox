DESCRIPTION = "Framebuffer-based digital media application"
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

FILES_${PN} += "${datadir}/fonts ${datadir}/keymaps ${libdir}/libopen.so"
FILES_${PN}-meta = "${datadir}/meta"

require enigma2-core-plugins.inc
