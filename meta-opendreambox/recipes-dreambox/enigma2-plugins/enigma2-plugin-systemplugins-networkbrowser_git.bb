SUMMARY = "Browse for and connect to network shares"
LICENSE = "CC-BY-NC-SA-3.0 | DreamProperty"
LIC_FILES_CHKSUM = "file://src/LICENSE;md5=c4127d21ca0781e51e4886f80a372bc7"
SRCREV = "${@opendreambox_srcrev('a4030d440930d5530bc9eabe4875ac6115403891', d)}"
DEPENDS = "libtirpc nfs-utils python"
PV = "4.3.2"

inherit autotools-brokensep pkgconfig opendreambox-github

export BUILD_SYS
export HOST_SYS
export STAGING_INCDIR
export STAGING_LIBDIR

RDEPENDS_${PN} = " \
    arp-scan \
    python-pysmb \
    python-twisted-core \
    python-xml \
"

require enigma2-plugin.inc

GITHUB_PROJECT = "enigma2-plugin-networkbrowser"
