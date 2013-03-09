PR = "${INC_PR}.2"

RDEPENDS_${PN} = " \
        initscripts \
        modutils-initscripts \
        sysvinit \
        udev"

require packagegroup-core-boot.inc
