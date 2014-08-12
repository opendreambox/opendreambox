SUMMARY = "Helper library to link against preloadable libraries"
SECTION = "base"
LICENSE = "CLOSED"
SRCREV = "${@opendreambox_srcrev('235cb0926c37b25f4509f9e5ab89431d4c46a6c3', d)}"

inherit autotools opendreambox-git lib_package pkgconfig
