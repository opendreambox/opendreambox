require recipes/linux/linux.inc

PACKAGES_DYNAMIC = "kernel-*"

# By default, kernel.bbclass modifies package names to allow multiple kernels
# to be installed in parallel. We revert this change and rprovide the versioned
# package names instead, to allow only one kernel to be installed.
PKG_kernel-base = "kernel-base"
PKG_kernel-image = "kernel-image"
RPROVIDES_kernel-base = "kernel-${KERNEL_VERSION}"
RPROVIDES_kernel-image = "kernel-image-${KERNEL_VERSION}"

USB_ROOT = "/dev/sdb2"
USB_ROOT_dm8000 = "/dev/sdf2"

do_install_append() {
        if [ "${KERNEL_IMAGETYPE}" = "vmlinux" ]; then
                # We want a stripped kernel that gets gzipped and booted from and
                # an unstripped version for debugging, which will get into the
                # kernel-vmlinux package. When booting vmlinux directly, work on a copy.
                if [ "${KERNEL_IMAGEDEST}" = "boot" ]; then
                        install -m644 ${D}/boot/vmlinux-${KERNEL_VERSION} ${D}/boot/vmlinux.nostrip
                fi
                # Mark the kernel as executable, so it gets stripped during do_package.
                chmod +x ${D}/${KERNEL_IMAGEDEST}/vmlinux-${KERNEL_VERSION}
        fi
        echo "/boot/bootlogo-${MACHINE}.elf.gz filename=/boot/bootlogo-${MACHINE}.jpg" > ${D}/${KERNEL_IMAGEDEST}/autoexec.bat
        echo "/boot/${KERNEL_IMAGETYPE}-${KERNEL_VERSION}.gz ${CMDLINE}" >> ${D}/${KERNEL_IMAGEDEST}/autoexec.bat
        echo "/boot/bootlogo-${MACHINE}.elf.gz filename=/boot/bootlogo-${MACHINE}.jpg" > ${D}/${KERNEL_IMAGEDEST}/autoexec_${MACHINE}.bat
        echo "/boot/${KERNEL_IMAGETYPE}-${KERNEL_VERSION}.gz ${USB_CMDLINE}" >> ${D}/${KERNEL_IMAGEDEST}/autoexec_${MACHINE}.bat
}

PACKAGES += "kernel-image-dbg kernel-image-usb"

FILES_kernel-image += "/${KERNEL_IMAGEDEST}/autoexec.bat"
FILES_kernel-image-dbg = "/${KERNEL_IMAGEDEST}/.debug"
FILES_kernel-image-usb = "/${KERNEL_IMAGEDEST}/autoexec_${MACHINE}.bat"
FILES_kernel-vmlinux = "/boot/vmlinux-${KERNEL_VERSION}"

python populate_packages_prepend() {
    import shutil
    imagetype = d.getVar('KERNEL_IMAGETYPE', True)
    if imagetype == "vmlinux":
        pkgd = d.getVar('PKGD', True)
        imagedest = d.getVar('KERNEL_IMAGEDEST', True)
        version = d.getVar('KERNEL_VERSION', True)
        os.system("gzip -9 %s/%s/vmlinux-%s" % (pkgd, imagedest, version))
        if imagedest == "boot":
            shutil.move("%s/boot/vmlinux.nostrip" % pkgd, "%s/boot/vmlinux-%s" % (pkgd, version))
}

pkg_preinst_kernel-image() {
        if [ -z "$D" ] && mountpoint -q /${KERNEL_IMAGEDEST}; then mount -o remount,rw /${KERNEL_IMAGEDEST}; fi
}
pkg_prerm_kernel-image() {
        if [ -z "$D" ] && mountpoint -q /${KERNEL_IMAGEDEST}; then mount -o remount,rw /${KERNEL_IMAGEDEST}; fi
}
pkg_postinst_kernel-image() {
        if [ -z "$D" ] && mountpoint -q /${KERNEL_IMAGEDEST}; then
                if grep -q '\<root=/dev/mtdblock3\>' /proc/cmdline && grep -q '\<root=ubi0:rootfs\>' /boot/autoexec.bat; then
                        sed -ie 's!${CMDLINE_UBI}!${CMDLINE_JFFS2}!' /boot/autoexec.bat;
                fi
                mount -o remount,ro /${KERNEL_IMAGEDEST};
        fi
}
pkg_postrm_kernel-image() {
        if [ -z "$D" ] && mountpoint -q /${KERNEL_IMAGEDEST}; then mount -o remount,ro /${KERNEL_IMAGEDEST}; fi
}

# Do not use update-alternatives!
pkg_postinst_kernel () {
}
pkg_postrm_kernel () {
}

CMDLINE_JFFS2 = "root=/dev/mtdblock3 rootfstype=jffs2 rw ${CMDLINE_CONSOLE}"
CMDLINE_UBI = "ubi.mtd=root root=ubi0:rootfs rootfstype=ubifs rw ${CMDLINE_CONSOLE}"
CMDLINE = "${@base_contains('IMAGE_FSTYPES', 'ubi.nfi', '${CMDLINE_UBI}', '${CMDLINE_JFFS2}', d)}"
USB_CMDLINE = "root=${USB_ROOT} rootdelay=10 rw ${CMDLINE_CONSOLE}"

COMPATIBLE_MACHINE = "^(dm500hd|dm500hdv2|dm800se|dm800sev2|dm7020hd|dm8000)$"

LOCALVERSION = "-${MACHINE}"
