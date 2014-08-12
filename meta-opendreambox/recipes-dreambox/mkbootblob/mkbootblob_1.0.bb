SUMMARY = "Create Dreambox eMMC boot BLOBs"
SECTION = "console/utils"
LICENSE = "CLOSED"

SRCREV = "${@opendreambox_srcrev('89561fa2873ab3dbbc4d9ecf63f70efa5cde12e2', d)}"

inherit autotools opendreambox-git

BBCLASSEXTEND = "native"
