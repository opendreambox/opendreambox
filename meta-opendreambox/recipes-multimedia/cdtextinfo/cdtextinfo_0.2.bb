SUMMARY = "Query CD-Text or information from CDDB"
AUTHOR = "Andreas Frisch <andreas.frisch@multimedia-labs.de>"
SECTION = "console"
LICENSE = "GPLv3+"
LIC_FILES_CHKSUM = "file://COPYING;md5=d32239bcb673463ab874e80d47fae504"
DEPENDS = "libcddb libcdio"
SRCREV = "16bcf3d8c961f4285ce66e1ed5393ff33186275d"

inherit autotools opendreambox-git pkgconfig
