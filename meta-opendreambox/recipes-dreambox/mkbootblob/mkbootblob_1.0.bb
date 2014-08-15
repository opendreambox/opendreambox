SUMMARY = "Create Dreambox eMMC boot BLOBs"
SECTION = "console/utils"
LICENSE = "CLOSED"

SRCREV = "${@opendreambox_srcrev('a461d5195083a3867a3ff8b67883c294c2b5ed0d', d)}"

inherit autotools opendreambox-git

BBCLASSEXTEND = "native"
