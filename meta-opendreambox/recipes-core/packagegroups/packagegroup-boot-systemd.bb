PR = "${INC_PR}.0"

RDEPENDS_${PN} = " \
        systemd \
        systemd-compat-units"

require packagegroup-boot.inc
