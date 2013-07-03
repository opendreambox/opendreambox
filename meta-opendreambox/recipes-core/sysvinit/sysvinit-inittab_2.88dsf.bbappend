do_install_append() {
        # default to runlevel 3
        sed -e 's,^id:5:initdefault:$,id:3:initdefault:,' -i ${D}${sysconfdir}/inittab
        # enable serial getty only in runlevel 5
        sed -e 's,^S:2345:,S:5:,' -i ${D}${sysconfdir}/inittab
        # start enigma2
        echo "e2:3:respawn:${bindir}/enigma2.sh" >> ${D}${sysconfdir}/inittab
}
