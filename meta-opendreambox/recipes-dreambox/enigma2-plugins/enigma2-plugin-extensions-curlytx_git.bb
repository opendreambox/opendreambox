SUMMARY = "Fetch and display remote text files via HTTP"
HOMEPAGE = "https://open-dreambox.org/trac/dreambox/wiki/CurlyTx"
LICENSE = "GPLv3+ | DreamProperty"
LIC_FILES_CHKSUM = "file://LICENSE;md5=36c7c4a563bcd72873ba9df8b753cc76"
SRCREV = "${@opendreambox_srcrev('6d13f83f4b1c1e9577064c41a7e5e6210119c640', d)}"
PE = "1"
PV = "1.1.1"

inherit autotools opendreambox-github

RDEPENDS_${PN} = "python-twisted-web"

require enigma2-plugin.inc

GITHUB_PROJECT = "enigma2-plugin-curlytx"
