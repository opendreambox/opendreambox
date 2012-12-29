DEPENDS = " \
        bdremux \
        ca-certificates \
        giflib \
        jpeg \
        libbluray \
        libdlsym \
        libsigc++-2.0 \
        minidlna \
        python \
        python-coherence \
        qt4-embedded \
        ubuntu-font-family \
"
INC_PR = "r9"

RDEPENDS_${PN} += " \
        libpagecache \
        libaio \
        python-ctypes \
        qnullscreen \
"

require enigma2-bin-common.inc
