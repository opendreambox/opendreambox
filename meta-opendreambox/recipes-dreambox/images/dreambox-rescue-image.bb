inherit image

BAD_RECOMMENDATIONS += "busybox-syslog udev-hwdb update-rc.d"

IMAGE_FEATURES = ""
IMAGE_FSTYPES = "cpio"
IMAGE_INSTALL = " \
        base-files \
        base-passwd \
        boot-scripts \
        busybox \
        devnodes-minimal \
        dreambox-dvb-modules-lcd \
        dropbear \
        e2fsprogs-e2fsck \
        e2fsprogs-mke2fs \
        google-dns \
        kmod \
        mkbootblob \
        netbase \
        initscripts \
        parted \
        procps \
        recovery \
        sysvinit \
        udev \
        util-linux-mount \
        xfsprogs-mkfs \
"
IMAGE_LINGUAS = ""
IMAGE_ROOTFS_SIZE = "16384"
USE_DEVFS = "1"

tweak_initramfs() {
        touch ${IMAGE_ROOTFS}${sysconfdir}/initrd-release
        sed -e '/enigma2/d' -i ${IMAGE_ROOTFS}${sysconfdir}/inittab
}

ROOTFS_POSTPROCESS_COMMAND += "tweak_initramfs; "
