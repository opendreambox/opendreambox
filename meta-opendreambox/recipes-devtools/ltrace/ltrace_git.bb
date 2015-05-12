SUMMARY = "Tracks runtime library calls in dynamically linked programs"
HOMEPAGE = "http://www.ltrace.org/"
SECTION = "devel"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=eb723b61539feef013de476e68b5c50a"
DEPENDS = "binutils elfutils"
SRCREV = "be0c6870e08a3be43b3a0d210fb8dc7614b1e82f"
PV = "0.7.3"

SRC_URI = "git://anonscm.debian.org/collab-maint/ltrace.git"

inherit autotools git-project

do_configure_prepend() {
    # from autogen.sh
    mkdir -p config/autoconf config/m4
}

PACKAGECONFIG ??= "${LIBUNWIND}"
PACKAGECONFIG[libunwind] = "--with-libunwind,--without-libunwind,libunwind"

LIBUNWIND = "libunwind"
LIBUNWIND_arm = ""
LIBUNWIND_libc-uclibc = ""
