DEPENDS := "${@oe_filter_out('^(virtual/libgl)$', '${DEPENDS}', d)} virtual/libgles2"

SRC_URI += "file://0002-Qt-Add-HbbTv-MIME-types.patch \
            file://0003-Qt-expose-WebKits-WebSecurityEnabled-setting.patch \
            file://0004-QtWebkit-Expose-keypress-event-and-correct-keycode-f.patch \
            file://0005-WebKit-small-hack-to-disable-use-of-WebkitWebSourceG.patch"

FILESEXTRAPATHS_prepend := "${THISDIR}/qt4-${PV}:"

QT_SQL_DRIVER_FLAGS += "-no-sql-sqlite2"
QT_GLFLAGS = "-opengl es2"
QT_QT3SUPPORT = "-no-qt3support"
QT_PHONON = "-no-phonon"
QT_DBUS = "-no-qdbus"
QT_CONFIG_FLAGS += " \
  -nomake demos -nomake docs -nomake examples \
  -no-gtkstyle \
"
