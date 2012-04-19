inherit update-rc.d

SRC_URI += "file://${INITSCRIPT_NAME}.sysvinit"

INITSCRIPT_NAME ?= "${PN}"

do_install_append() {
        if [ -f ${WORKDIR}/${INITSCRIPT_NAME}.sysvinit ]; then
                install -d ${D}${INIT_D_DIR}
                install -m 0755 ${WORKDIR}/${INITSCRIPT_NAME}.sysvinit ${D}${INIT_D_DIR}/${INITSCRIPT_NAME}
        fi
}
