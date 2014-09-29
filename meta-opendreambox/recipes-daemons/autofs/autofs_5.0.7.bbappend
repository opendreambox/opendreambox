SRC_URI += "file://autofs-5.0.7-link-autofs.a-into-executable-only.patch \
            file://11default_automaster_location.patch \
            file://12disable_default_auto_master.patch \
            file://default-autofs-remove-USE_MISC_DEVICE.patch \
            file://autofs.init"

do_install_append() {
    install -d ${D}${INIT_D_DIR}
    install -m755 ${WORKDIR}/autofs.init ${D}${INIT_D_DIR}/${INITSCRIPT_NAME}
}

PARALLEL_MAKEINST = ""

FILESEXTRAPATHS_prepend := "${THISDIR}/${P}:"
