inherit qmake5 opendreambox-github

LICENSE = "CLOSED"

DEPENDS += "qtbase qtwebengine alsa-lib"
RDEPENDS_${PN} += "qtbase-plugin-platforms-qeglfs"

SRCREV = "${@opendreambox_srcrev('1658b7f8e0cf1e713c86a7a48b013acbabc03571', d)}"
