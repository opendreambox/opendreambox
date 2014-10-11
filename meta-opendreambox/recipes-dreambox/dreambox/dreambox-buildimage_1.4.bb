SUMMARY = "create Dreambox NAND boot images"
SECTION = "console/utils"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://src/buildimage.c;endline=17;md5=ea8d8cabec86117939480a328ac3a34b"

SRCREV = "${@opendreambox_srcrev('70134e493fa82d1ff1276a0f78cda22431d4c1f4', d)}"

inherit autotools opendreambox-git

BBCLASSEXTEND = "native"

OPENDREAMBOX_PROJECT = "buildimage"
