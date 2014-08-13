SUMMARY = "Create Dreambox eMMC boot BLOBs"
SECTION = "console/utils"
LICENSE = "CLOSED"

SRCREV = "${@opendreambox_srcrev('08dce8bbef22c3c981c0d476ed3d424a10ef61c7', d)}"

inherit autotools opendreambox-git

BBCLASSEXTEND = "native"
