SUMMARY = "Reconstruct .ap and .sc files"
DESCRIPTION = "Reconstruct missing or corrupt .ap and .sc files of recorded movies."
LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://src_cc/reconstruct_apsc.cc;endline=12;md5=ee269abb4b18f5f29884937124fb9565"
SRCREV = "${@opendreambox_srcrev('fff055c6b3170d9c8d06bf523bab3e7bb2e769e0', d)}"
PV = "4.4.1"

inherit autotools opendreambox-github

require enigma2-plugin.inc

GITHUB_PROJECT = "enigma2-plugin-reconstructapsc"
