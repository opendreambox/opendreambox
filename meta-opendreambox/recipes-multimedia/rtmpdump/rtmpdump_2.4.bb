DESCRIPTION = "a toolkit for RTMP streams"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=751419260aa954499f7abaabaa882bbe"
DEPENDS = "openssl zlib"
SRCREV = "feb81c8b3e0102b2eed18a34cbfb1e8a513e99ae"

SRC_URI = "git://git.ffmpeg.org/rtmpdump"

inherit git-project lib_package

EXTRA_OEMAKE = "CROSS_COMPILE=${TARGET_PREFIX} prefix=${prefix} mandir=${mandir}"

do_install() {
        install -d ${D}${libdir}
        oe_runmake install DESTDIR=${D}
}
