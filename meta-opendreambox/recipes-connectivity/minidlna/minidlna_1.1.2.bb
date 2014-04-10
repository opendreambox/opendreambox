SUMMARY = "lightweight DLNA/UPnP-AV server targeted at embedded systems"
HOMEPAGE = "http://sourceforge.net/projects/minidlna/"
SECTION = "network"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=b1a795ac1a06805cf8fd74920bc46b5c"
DEPENDS = "libexif jpeg libid3tag flac libvorbis sqlite3 libav util-linux"

SRC_URI = "${SOURCEFORGE_MIRROR}/${BPN}/${BPN}/${PV}/${BP}.tar.gz \
           file://0001_default_sqlite_caches.diff"
SRC_URI[md5sum] = "65cebffaf9b57bf30fbfcf2a3a3253e6"
SRC_URI[sha256sum] = "97e2e9141c1190d76ad97f0da083874bccf9f9590841be9eb7668bcf695b7204"

inherit autotools gettext

PACKAGES =+ "${PN}-utils"

FILES_${PN}-utils = "${bindir}/test*"
