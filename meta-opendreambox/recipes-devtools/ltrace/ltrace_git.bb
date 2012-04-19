DESCRIPTION = "Tracks runtime library calls in dynamically linked programs"
HOMEPAGE = "http://www.ltrace.org/"
SECTION = "devel"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=eb723b61539feef013de476e68b5c50a"
DEPENDS = "binutils elfutils libunwind"
SRCREV = "fed1e8d33ab050df892a88110e1a316d285ee650"
PV = "0.6.0"
PR = "r0"

SRC_URI = "git://anonscm.debian.org/collab-maint/ltrace.git \
           file://0001-breakpoints.c-fix-compile-for-mips.patch"

inherit autotools git-project

EXTRA_OECONF = "--disable-werror"
