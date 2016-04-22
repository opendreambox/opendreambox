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
        ${@base_contains('MACHINE', 'dm520', 'dreambox-dvb-modules-stb-core', 'dreambox-dvb-modules-lcd', d)} \
        dropbear \
        e2fsprogs-e2fsck \
        google-dns \
        kmod \
        netbase \
        init-ifupdown \
        initscripts \
        modutils-initscripts \
        procps \
        recovery-ui \
        recovery-web \
        sysvinit \
        udev \
        xfsprogs-mkfs \
"
IMAGE_LINGUAS = ""
IMAGE_ROOTFS_SIZE = "16384"
USE_DEVFS = "1"

ISSUE_TEXT  = ">>> Your Dreambox has booted into RESCUE MODE.\n"
ISSUE_TEXT .= ">>> Please log in as user 'root' (no password required),\n"
ISSUE_TEXT .= ">>> then run 'help' to get further information.\n"
ISSUE_TEXT .= "\n"

tweak_initramfs() {
        touch ${IMAGE_ROOTFS}${sysconfdir}/initrd-release
        sed -e '/enigma2/d' -i ${IMAGE_ROOTFS}${sysconfdir}/inittab
        printf "${ISSUE_TEXT}" >> ${IMAGE_ROOTFS}${sysconfdir}/issue
        printf "${ISSUE_TEXT}" >> ${IMAGE_ROOTFS}${sysconfdir}/issue.net
}

ROOTFS_POSTPROCESS_COMMAND += "tweak_initramfs; "
