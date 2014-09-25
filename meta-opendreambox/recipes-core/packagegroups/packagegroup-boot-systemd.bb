RDEPENDS_${PN} = " \
        systemd \
        systemd-compat-units"

# Systemd forces us to use util-linux-mount, which in turn forces
# us to include nfs-utils-client to support NFS shares and cifs-utils
# for CIFS shares.
RDEPENDS_${PN} += "cifs-utils nfs-utils-mount"

require packagegroup-boot.inc
