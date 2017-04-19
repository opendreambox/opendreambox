SUMMARY = "Determine whether a programme begins earlier or lasts longer"
LICENSE = "CC-BY-3.0"
LIC_FILES_CHKSUM = "file://src_py/LICENSE;md5=c246e9f1bde26a3911dc137073d6789e"
SRCREV = "${@opendreambox_srcrev('7881aeec1ba5623ec9a36ac71c29fd9572b77a47', d)}"
PE = "1"
PV = "1.6+git${SRCPV}"

inherit autotools-brokensep opendreambox-github

RDEPENDS_${PN} = " \
    python-twisted-core \
    python-twisted-web \
    python-xml \
"

require enigma2-plugin.inc

GITHUB_PROJECT = "enigma2-plugin-vps"
