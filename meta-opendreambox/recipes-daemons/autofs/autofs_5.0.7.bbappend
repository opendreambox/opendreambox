PRINC := "${@int(PRINC) + 1}"

SRC_URI += "file://autofs-5.0.7-link-autofs.a-into-executable-only.patch \
            file://autofs-5.0.7-fix-dependencies-for-rpcgen.patch \
            file://11default_automaster_location.patch \
            file://12disable_default_auto_master.patch \
            file://default-autofs-remove-USE_MISC_DEVICE.patch \
            file://autofs.init"

inherit systemd

do_install_append() {
    if ! ${@base_contains('DISTRO_FEATURES', 'systemd', 'true', 'false', d)}; then
        rm -r ${D}${systemd_unitdir}
        rmdir --ignore-fail-on-non-empty ${D}${base_libdir}
    fi
    install -d ${D}${INIT_D_DIR}
    install -m755 ${WORKDIR}/autofs.init ${D}${INIT_D_DIR}/${INITSCRIPT_NAME}
}

FILESEXTRAPATHS_prepend := "${THISDIR}/${P}:"

SYSTEMD_SERVICE_${PN} = "autofs.service"
