PR = "${INC_PR}.0"

RDEPENDS_${PN} = " \
        initscripts \
        modutils-initscripts \
        sysvinit \
        udev"

require task-core-boot.inc
