DEPENDS := "${@oe_filter_out('^(gstreamer|gst-plugins-base|virtual/libgl)$', '${DEPENDS}', d)} virtual/libgles2"

SRC_URI += "file://0002-Qt-Add-HbbTv-MIME-types.patch \
            file://0003-Qt-Expose-Webkits-WebSecurityEnabled-settings-via-QW.patch \
            file://0004-QtWebkit-Expose-keypress-event-and-correct-keycode-f.patch \
            file://0005-WebKit-small-hack-to-disable-use-of-WebkitWebSourceG.patch \
            file://0006-QtWebKit-disable-video-to-get-rid-of-gstreamer-depen.patch \
            file://0007-QWS-Export-qt_get_server_queue.patch"

FILESEXTRAPATHS_prepend := "${THISDIR}/qt4-${PV}:"

QT_SQL_DRIVER_FLAGS += "-no-sql-sqlite2"
QT_GLFLAGS = "-opengl es2"
QT_QT3SUPPORT = "-no-qt3support"
QT_PHONON = "-no-gstreamer -no-phonon"
QT_CONFIG_FLAGS += " \
  -nomake demos -nomake docs -nomake examples \
  -no-gtkstyle \
"
