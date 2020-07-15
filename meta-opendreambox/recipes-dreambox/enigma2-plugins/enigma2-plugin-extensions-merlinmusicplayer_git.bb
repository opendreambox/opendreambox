SUMMARY = "Merlin Music Player and iDream"
DESCRIPTION = "Manage your music files in a database, play it with Merlin Music Player."
LICENSE = "CC-BY-NC-SA-3.0 | DreamProperty"
LIC_FILES_CHKSUM = "file://src/plugin.py;beginline=5;endline=21;md5=c1a4ac5f6bd845cc16cccbe2a510092c"
SRCREV = "${@opendreambox_srcrev('cdb73baf3186d83b5721f4d4cbc7b23bfbec0ac9', d)}"
DEPENDS = "gstreamer1.0"
PV = "4.4.1"

inherit autotools-brokensep opendreambox-github

RDEPENDS_${PN} = " \
    python-mutagen \
    python-simplejson \
    python-sqlite3 \
    python-twisted-web \
"

require enigma2-plugin-cpp.inc

GITHUB_PROJECT = "enigma2-plugin-merlinmusicplayer"
