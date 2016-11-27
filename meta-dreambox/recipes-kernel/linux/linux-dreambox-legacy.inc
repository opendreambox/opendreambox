require linux.inc
require linux-rdepends.inc

do_configure_prepend() {
        sed -e "/^SUBLEVEL = /d" -i ${S}/Makefile
}

KERNEL_ENABLE_CGROUPS = "1"

# By default, kernel.bbclass modifies package names to allow multiple kernels
# to be installed in parallel. We revert this change and rprovide the versioned
# package names instead, to allow only one kernel to be installed.
PKG_kernel-base = "kernel-base"
PKG_kernel-image = "kernel-image"
RPROVIDES_kernel-base = "kernel-${KERNEL_VERSION}"
RPROVIDES_kernel-image = "kernel-image-${KERNEL_VERSION}"

do_install_append() {
        if [ "${KERNEL_IMAGETYPE}" = "vmlinux" ]; then
                # We want a stripped kernel that gets gzipped and booted from and
                # an unstripped version for debugging, which will get into the
                # kernel-vmlinux package. When booting vmlinux directly, work on a copy.
                if [ "${KERNEL_IMAGEDEST}" = "boot" ]; then
                        install -m644 ${D}/${KERNEL_IMAGEDEST}/${KERNEL_IMAGETYPE}-${KERNEL_VERSION} ${D}/${KERNEL_IMAGEDEST}/${KERNEL_IMAGETYPE}.nostrip
                fi
                # Mark the kernel as executable, so it gets stripped during do_package.
                chmod +x ${D}/${KERNEL_IMAGEDEST}/${KERNEL_IMAGETYPE}-${KERNEL_VERSION}
        fi
        echo "/boot/${KERNEL_IMAGETYPE}-${KERNEL_VERSION} ${CMDLINE}" > ${D}/${KERNEL_IMAGEDEST}/autoexec.bat
}

PACKAGES += "kernel-image-dbg"

FILES_kernel-image += "/${KERNEL_IMAGEDEST}/autoexec.bat"
FILES_kernel-image-dbg = "/${KERNEL_IMAGEDEST}/.debug"
FILES_kernel-vmlinux = "/boot/vmlinux-${KERNEL_VERSION}"

python populate_packages_prepend() {
    import shutil
    imagetype = d.getVar('KERNEL_IMAGETYPE', True)
    if imagetype == "vmlinux":
        pkgd = d.getVar('PKGD', True)
        imagedest = d.getVar('KERNEL_IMAGEDEST', True)
        version = d.getVar('KERNEL_VERSION', True)
        target = "%s/%s/%s-%s" % (pkgd, imagedest, imagetype, version)
        os.system("gzip -9 %s" % target)
        if imagedest == "boot":
            shutil.move("%s/%s/%s.nostrip" % (pkgd, imagedest, imagetype), target)
}

pkg_preinst_kernel-image() {
        if [ -z "$D" ] && mountpoint -q /${KERNEL_IMAGEDEST}; then mount -o remount,rw /${KERNEL_IMAGEDEST}; fi
}
pkg_prerm_kernel-image() {
        if [ -z "$D" ] && mountpoint -q /${KERNEL_IMAGEDEST}; then mount -o remount,rw /${KERNEL_IMAGEDEST}; fi
}
pkg_postinst_kernel-image() {
        if [ -z "$D" ] && mountpoint -q /${KERNEL_IMAGEDEST}; then mount -o remount,ro /${KERNEL_IMAGEDEST}; fi
}
pkg_postrm_kernel-image() {
        if [ -z "$D" ] && mountpoint -q /${KERNEL_IMAGEDEST}; then mount -o remount,ro /${KERNEL_IMAGEDEST}; fi
}

# Do not use update-alternatives!
pkg_postinst_kernel () {
}
pkg_postrm_kernel () {
}
