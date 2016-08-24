inherit qmake5

# Set path of qt5 headers as qmake5_base.bbclass sets this to just ${includedir}
# but actually it is ${includedir}/qt5
OE_QMAKE_PATH_HEADERS = "${OE_QMAKE_PATH_QT_HEADERS}"

require qxmpp-git.inc

DEPENDS += "qtbase"
