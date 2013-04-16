DEPENDS := "${@oe_filter_out('^(mysql5|postgresql|sqlite)$', '${DEPENDS}', d)}"
PR .= "-dream8"

SRC_URI += "file://0001-Qt-remove-x11-from-npapi-while-keeping-some-basic-fu.patch \
            file://0002-Qt-Add-HbbTv-MIME-types.patch \
            file://0003-Qt-expose-WebKits-WebSecurityEnabled-setting.patch \
            file://0004-QtWebkit-Expose-keypress-event-and-correct-keycode-f.patch \
            file://0005-WebKit-small-hack-to-disable-use-of-WebkitWebSourceG.patch"

FILESEXTRAPATHS_prepend := "${THISDIR}/${P}:"

QT_CONFIG_FLAGS += "-nomake demos -nomake docs -nomake examples"

QT_GLIB_FLAGS = "-no-glib"
QT_IMAGEFORMAT_FLAGS += "-no-libmng"
QT_PHONON_FLAGS = "-no-phonon"
QT_QDBUS_FLAGS = "-no-qdbus"
QT_QT3SUPPORT_FLAGS = "-no-qt3support"
QT_SQL_DRIVER_FLAGS = "-no-sql-ibase -no-sql-mysql -no-sql-odbc -no-sql-psql -no-sql-sqlite2 -plugin-sql-sqlite -system-sqlite"
QT_WEBKIT_FLAGS = "-webkit"

QT_DECORATION_FLAGS = "-plugin-decoration-default -plugin-decoration-styled -plugin-decoration-windows"
QT_GFX_DRIVER_FLAGS = "-plugin-gfx-directfb -plugin-gfx-linuxfb -no-gfx-multiscreen -no-gfx-qvfb -no-gfx-transformed -no-gfx-vnc"
QT_KBD_DRIVER_FLAGS = "-plugin-kbd-linuxinput -no-kbd-tty -no-kbd-qvfb"
QT_MOUSE_DRIVER_FLAGS = "-qt-mouse-linuxinput -plugin-mouse-linuxtp -plugin-mouse-pc -no-mouse-qvfb -plugin-mouse-tslib"

SQUASHFS_IMG_PACKAGES = "${PN}-core-sqsh-img:${PN}-webkit-sqsh-img"
SQUASHFS_IMG_REPLACES = "libqt-embeddedcore4 libqt-embeddedgui4 libqt-embeddednetwork4:libqt-embeddedwebkit4 \
	libqt-embeddedsvg4 qt4-embedded-plugin-imageformat-gif \
	qt4-embedded-plugin-imageformat-ico qt4-embedded-plugin-imageformat-jpeg qt4-embedded-plugin-imageformat-svg \
	qt4-embedded-plugin-imageformat-tiff"
SQUASHFS_IMG_BLOCKSIZES = "262144:524288"
inherit squashfs-img
