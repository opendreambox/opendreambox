PR = "${INC_PR}.0"

RDEPENDS_${PN} = " \
        initscripts \
        modutils-initscripts \
        sysvinit"

require packagegroup-boot.inc
