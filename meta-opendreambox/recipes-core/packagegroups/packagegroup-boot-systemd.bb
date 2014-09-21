RDEPENDS_${PN} = " \
        systemd \
        systemd-compat-units"

# Systemd forces us to use util-linux-mount, which in turn forces
# us to include nfs-utils-client to support NFS shares.
RDEPENDS_${PN} += "nfs-utils-mount"

require packagegroup-boot.inc
