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
"
INC_PR = "r7"

RDEPENDS_${PN} += " \
        libaio \
        python-ctypes \
        qnullscreen \
"

require enigma2-bin-common.inc
