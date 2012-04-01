PR .= "-dream3"

do_install_append() {
        sed -e 's,^id:5:initdefault:$,id:3:initdefault:,' -i ${D}${sysconfdir}/inittab
        echo "S:5:respawn:${base_sbindir}/getty ttyS0 115200" >> ${D}${sysconfdir}/inittab
        echo "e2:3:respawn:${bindir}/enigma2.sh" >> ${D}${sysconfdir}/inittab
}
