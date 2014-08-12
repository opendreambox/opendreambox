SUMMARY = "a tool to run opkg and visualize the progress on the framebuffer (used by enigma2)"
LICENSE = "CLOSED"

SRCREV = "${@opendreambox_srcrev('a040475c64b2cc08a866d3ce062a23a760a6a077', d)}"

inherit autotools pkgconfig opendreambox-git
