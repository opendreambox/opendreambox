# live555 OE build file
# Copyright (C) 2005, Koninklijke Philips Electronics NV.  All Rights Reserved
# Released under the MIT license (see packages/COPYING)

DESCRIPTION = "LIVE555 Streaming Media libraries"
HOMEPAGE = "http://live.com/"
LICENSE = "LGPLv3"
SECTION = "devel"

INC_PR = "r1"

URLV = "${@d.getVar('PV',1)[0:4]}.${@d.getVar('PV',1)[4:6]}.${@d.getVar('PV',1)[6:8]}"
SRC_URI = "http://www.live555.com/liveMedia/public/live.${URLV}.tar.gz"
# only latest live version stays on http://www.live555.com/liveMedia/public/, add mirror for older
MIRRORS += "http://www.live555.com/liveMedia/public/ http://distcache.FreeBSD.org/ports-distfiles/ \n"

S = "${WORKDIR}/live"
TARGET_CC_ARCH += "${LDFLAGS}"

do_configure() {
    ./genMakefiles linux-with-shared-libraries
}

do_compile() {
    make
}

do_install() {
    make DESTDIR=${D} install
}

PACKAGES =+ " live555-openrtsp live555-playsip live555-mediaserver live555-examples"
FILES_live555-openrtsp = "${bindir}/openRTSP"
FILES_live555-playsip = "${bindir}/playSIP"
FILES_live555-mediaserver = "${bindir}/live555MediaServer"
FILES_live555-examples = "${bindir}/*"