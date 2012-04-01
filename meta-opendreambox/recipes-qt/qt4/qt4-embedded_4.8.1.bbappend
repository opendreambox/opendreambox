DEPENDS := "${@oe_filter_out('^(mysql5|postgresql|sqlite)$', '${DEPENDS}', d)}"
PR .= "-dream1"

SRC_URI += "file://0001-Qt-build-NPAPI-without-X11.patch \
            file://0002-Qt-Add-HbbTv-MIME-types.patch"

FILESEXTRAPATHS_prepend := "${THISDIR}/${P}:"

QT_CONFIG_FLAGS += "-nomake demos -nomake docs -nomake examples"

QT_SQL_DRIVER_FLAGS += "-no-sql-mysql -no-sql-psql -no-sql-sqlite2"
