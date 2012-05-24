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
INC_PR = "r5"

RDEPENDS_${PN} += "qnullscreen"

require enigma2-bin-common.inc
