require espeak.inc
inherit siteinfo

EXTRA_PHONEMES = '${@bb.utils.contains("SITEINFO_ENDIANNESS", "be",  "espeak-data (= ${PV})", "", d)}'
RDEPENDS_${PN} = "portaudio-v19 ${EXTRA_PHONEMES}"

SRC_URI[md5sum] = "cadd7482eaafe9239546bdc09fa244c3"
SRC_URI[sha256sum] = "bf9a17673adffcc28ff7ea18764f06136547e97bbd9edf2ec612f09b207f0659"

CXXFLAGS += "-DUSE_PORTAUDIO"
TARGET_CC_ARCH += "${LDFLAGS}"

FILES_${PN} += "${datadir}/espeak-data"

do_configure() {
    #  "speak" binary, a TTS engine, uses portaudio in either APIs V18 or V19, use V19
    cp "${S}/src/portaudio19.h" "${S}/src/portaudio.h"
}

do_compile() {
    cd src
    oe_runmake
}

do_install() {
    install -d ${D}${bindir}
    install -d ${D}${libdir}
    install -d ${D}${includedir}/espeak
    install -d ${D}${datadir}/espeak-data

    # we do not ship "speak" binary though.
    install -m 0755 ${S}/src/espeak ${D}${bindir}
    install -m 0644 ${S}/src/speak_lib.h ${D}${includedir}/espeak/
    ln -sf espeak/espeak.h ${D}${includedir}/
    oe_libinstall -so -C src libespeak ${D}${libdir}

    if [ "${SITEINFO_ENDIANNESS}" = "be" ] ; then
        # the big-endian phon* files are provided by the package espeak-data
        rm -f ${S}/espeak-data/phon*
    fi

    cp -prf ${S}/espeak-data/* ${D}${datadir}/espeak-data
    chown -R root:root ${D}${datadir}/espeak-data
}
