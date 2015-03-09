SUMMARY = "create Dreambox NAND boot images"
SECTION = "console/utils"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://src/buildimage.c;endline=17;md5=ea8d8cabec86117939480a328ac3a34b"
PR = "r3"

SRCREV = "c396f4753c103b1930b2b25ea528cfeaaf7c51fe"

inherit autotools opendreambox-git

BBCLASSEXTEND = "native"

OPENDREAMBOX_PROJECT = "buildimage"
