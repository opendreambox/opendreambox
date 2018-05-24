LICENSE = "LGPLv3"
LIC_FILES_CHKSUM = "file://COPYING;md5=1ebbd3e34237af26da5dc08a4e440464"
SUMMARY = "libsss-segment"

SRCREV = "${@opendreambox_srcrev('b5cbd3dec645d7ebee752b954953a01fac1865f2', d)}"

inherit opendreambox-github autotools pkgconfig

