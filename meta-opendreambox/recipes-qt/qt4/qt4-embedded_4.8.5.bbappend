DEPENDS := "${@oe_filter_out('^(gstreamer|gst-plugins-base)$', '${DEPENDS}', d)}"

SRC_URI += "file://0001-Qt-remove-x11-from-npapi-while-keeping-some-basic-fu.patch \
            file://0002-Qt-Add-HbbTv-MIME-types.patch \
            file://0003-Qt-Expose-Webkits-WebSecurityEnabled-settings-via-QW.patch \
            file://0004-QtWebkit-Expose-keypress-event-and-correct-keycode-f.patch \
            file://0005-WebKit-small-hack-to-disable-use-of-WebkitWebSourceG.patch \
            file://0006-QtWebKit-disable-video-to-get-rid-of-gstreamer-depen.patch \
            file://0007-QWS-Export-qt_get_server_queue.patch \
            file://0008-QEventLoop-dont-catch-exceptions.patch"

FILESEXTRAPATHS_prepend := "${THISDIR}/qt4-${PV}:"

QT_CONFIG_FLAGS += "-nomake demos -nomake docs -nomake examples"
QT_SQL_DRIVER_FLAGS = "-no-sql-ibase -no-sql-mysql -no-sql-odbc -no-sql-psql -no-sql-sqlite2 -plugin-sql-sqlite -system-sqlite"
QT_QT3SUPPORT = "-no-qt3support"
QT_WEBKIT = "-webkit"
QT_PHONON = "-no-gstreamer -no-phonon"

QT_GLIB_FLAGS = "-no-glib"
QT_IMAGEFORMAT_FLAGS += "-no-libmng"
QT_DECORATION_FLAGS = "-plugin-decoration-default -plugin-decoration-styled -plugin-decoration-windows"
QT_GFX_DRIVER_FLAGS = "-plugin-gfx-directfb -plugin-gfx-linuxfb -no-gfx-multiscreen -no-gfx-qvfb -no-gfx-transformed -no-gfx-vnc"
QT_KBD_DRIVER_FLAGS = "-plugin-kbd-linuxinput -no-kbd-tty -no-kbd-qvfb"
QT_MOUSE_DRIVER_FLAGS = "-qt-mouse-linuxinput -plugin-mouse-linuxtp -plugin-mouse-pc -no-mouse-qvfb -plugin-mouse-tslib"

QT_EMBEDDED_EXTRA_FLAGS = " \
	${QT_GLIB_FLAGS} \
	${QT_IMAGEFORMAT_FLAGS} \
	${QT_DECORATION_FLAGS} \
	${QT_GFX_DRIVER_FLAGS} \
	${QT_KBD_DRIVER_FLAGS} \
	${QT_MOUSE_DRIVER_FLAGS} \
"
