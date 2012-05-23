SUMMARY = "Qt null Screen Driver Plug-in"
LICENSE = "CLOSED"
SRCREV = "fc1253bc9d04a21ac407d31fd03c4f381bb8c098"
PR = "r0"

inherit opendreambox-git qt4e

EXTRA_OEMAKE += "INSTALL_ROOT=${D}"

export QT_CONF_PATH="${WORKDIR}/qt.conf"

do_configure_prepend() {
        echo "[Paths]"                                   > $QT_CONF_PATH
        echo "Plugins=${libdir}/${QT_DIR_NAME}/plugins" >> $QT_CONF_PATH
}
do_install() {
        oe_runmake install
}

FILES_${PN} += "${libdir}/${QT_DIR_NAME}/plugins/*/*${SOLIBSDEV}"
FILES_${PN}-dbg += "${libdir}/${QT_DIR_NAME}/plugins/*/.debug/*${SOLIBSDEV}"
