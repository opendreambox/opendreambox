SUMMARY = "Displays an IFrame using a LinuxTV video decoder"
SECTION = "base"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://src/showiframe.c;endline=10;md5=513a8a3c6a14de8ef311dfa25fb0eaa6"

SRCREV = "${@opendreambox_srcrev('f41a446011998102d333a835df45a1fb0fa60bd1', d)}"

inherit autotools opendreambox-git
