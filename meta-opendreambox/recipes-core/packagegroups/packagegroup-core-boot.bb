PR = "${INC_PR}.1"

RDEPENDS_${PN} = " \
        busybox-xinetd \
        initscripts \
        modutils-initscripts \
        sysvinit \
        udev"

require packagegroup-core-boot.inc
