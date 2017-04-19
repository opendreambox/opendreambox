SUMMARY = "Stalker Middleware Client for enigma2"
LICENSE = "CLOSED"
DEPENDS = "enigma2"

GITHUB_PROJECT = "enigma2-plugin-stalkerclient"

SRCREV = "${@opendreambox_srcrev('cbed49093ef4fecea7ccf6e593d3f500e3f5e99b', d)}"

inherit autotools pkgconfig opendreambox-github

RDEPENDS_${PN} = " \
        python-json \
        python-twisted-web \
"

require enigma2-plugin.inc
