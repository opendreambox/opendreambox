inherit image

BAD_RECOMMENDATIONS += " \
        busybox-syslog \
        lighttpd-module-access \
        lighttpd-module-accesslog \
        udev-hwdb \
        update-rc.d \
"

IMAGE_FEATURES = ""
IMAGE_FSTYPES = "cpio"
IMAGE_INSTALL = " \
        base-files \
        base-passwd \
        busybox \
        devnodes-minimal \
        dreambox-dvb-modules-lcd \
        dropbear \
        e2fsprogs-e2fsck \
        google-dns \
        kmod \
        netbase \
        init-ifupdown \
        initscripts \
        procps \
        recovery-web \
        sysvinit \
        udev \
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
