do_install_append() {
    sed -e 's,^\(root:.*\):/bin/sh$,\1:/bin/bash,' -i ${D}${datadir}/base-passwd/passwd.master
}
