DESCRIPTION = "create Dreambox NAND boot images"
SECTION = "console/utils"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://src/buildimage.c;endline=17;md5=ea8d8cabec86117939480a328ac3a34b"
PR = "r0"

SRCREV = "8f00307fdaa5d1ce3d6ffbe92e0f90c219a10500"

inherit autotools opendreambox-git

BBCLASSEXTEND = "native"

OPENDREAMBOX_PROJECT = "buildimage"
