SUMMARY = "Create Dreambox eMMC boot BLOBs"
SECTION = "console/utils"
LICENSE = "CLOSED"

SRCREV = "${@opendreambox_srcrev('60d15e3867a1c6f801117e42d67e6e2fe207fe07', d)}"

inherit autotools opendreambox-git

BBCLASSEXTEND = "native"
