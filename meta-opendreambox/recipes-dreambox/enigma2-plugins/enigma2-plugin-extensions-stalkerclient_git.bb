SUMMARY = "Stalker Middleware Client for enigma2"
LICENSE = "CC-BY-NC-SA-3.0 | DreamProperty"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=32537e3540aaefc28cb3edf82c2696cf"

GITHUB_PROJECT = "enigma2-plugin-stalkerclient"

SRCREV = "${@opendreambox_srcrev('f07e41cd8086714b84ba0fd6d915d5181b064b1e', d)}"

inherit autotools opendreambox-github

RDEPENDS_${PN} = " \
        python-json \
        python-twisted-web \
"

require enigma2-plugin.inc
