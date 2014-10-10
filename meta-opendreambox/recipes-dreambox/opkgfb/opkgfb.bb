SUMMARY = "a tool to run opkg and visualize the progress on the framebuffer (used by enigma2)"
LICENSE = "CLOSED"

SRCREV = "${@opendreambox_srcrev('56465e615f0448e5fb19f8bcaf738b0d88f6ba4a', d)}"

inherit autotools pkgconfig opendreambox-git
