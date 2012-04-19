PR .= "-dream3"

do_install_append() {
        ln -s media/hdd ${D}/hdd

        rm -r ${D}/mnt
        ln -s media ${D}/mnt

        rmdir ${D}/tmp
        ln -s var/tmp ${D}/tmp

        ln -s var/run ${D}/run
}

FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"
