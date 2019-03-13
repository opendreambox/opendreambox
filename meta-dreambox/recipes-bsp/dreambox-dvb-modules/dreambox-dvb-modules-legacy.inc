require dreambox-dvb-modules.inc

inherit module-base

addtask make_scripts after do_prepare_recipe_sysroot before do_compile
do_make_scripts[lockfiles] = "${TMPDIR}/kernel-scripts.lock"
do_make_scripts[depends] += "virtual/kernel:do_shared_workdir"

do_install_append() {
    install -d ${D}${sysconfdir}/modules-load.d
    echo stb-core > ${D}${sysconfdir}/modules-load.d/01-${BPN}-stb-core.conf
    chmod 0644 ${D}${sysconfdir}/modules-load.d/01-${BPN}-stb-core.conf
    if [ -f ${D}/lib/modules/${DM_LOCALVERSION}/extra/lcd.ko ]; then
        echo lcd > ${D}${sysconfdir}/modules-load.d/02-${BPN}-lcd.conf
        chmod 0644 ${D}${sysconfdir}/modules-load.d/02-${BPN}-lcd.conf
    fi
    for module in ${SOC_FAMILY} dreambox_keyboard ble ${MODULES_TO_LOAD}; do
        if [ -n "$(find ${D}/lib/modules/${DM_LOCALVERSION}/extra -name $module.ko)" ]; then
            echo $module >> ${D}${sysconfdir}/modules-load.d/10-${BPN}.conf
        fi
    done
    if [ -f ${D}${sysconfdir}/modules-load.d/10-${BPN}.conf ]; then
        chmod 0644 ${D}${sysconfdir}/modules-load.d/10-${BPN}.conf
    fi
}
