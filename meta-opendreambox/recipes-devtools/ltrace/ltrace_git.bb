SUMMARY = "Tracks runtime library calls in dynamically linked programs"
HOMEPAGE = "http://www.ltrace.org/"
SECTION = "devel"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=eb723b61539feef013de476e68b5c50a"
DEPENDS = "binutils elfutils ${LIBUNWIND}"
SRCREV = "d66c8b11facf570d96a49c1b812b90101c62023b"
PV = "0.7.2"

SRC_URI = "git://anonscm.debian.org/collab-maint/ltrace.git \
           file://0001-linux-uclibc-targets-should-be-handled-by-linux-gnu-.patch"

inherit autotools git-project

EXTRA_OECONF = "--disable-werror"

do_configure_prepend() {
    # from autogen.sh
    mkdir -p config/autoconf config/m4
}

LIBUNWIND = "libunwind"
LIBUNWIND_libc-uclibc = ""
