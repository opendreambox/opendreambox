SUMMARY = "Stalker Middleware Client for enigma2"
LICENSE = "CLOSED"
DEPENDS = "enigma2"

GITHUB_PROJECT = "enigma2-plugin-stalkerclient"

SRCREV = "${@opendreambox_srcrev('2fbc070eb69f15b7acf57cfc29cfbd8dc88a40d1', d)}"

inherit autotools pkgconfig opendreambox-github

RDEPENDS_${PN} = " \
        python-json \
        python-twisted-web \
"

FILES_${PN} += "${libdir}/enigma2"

