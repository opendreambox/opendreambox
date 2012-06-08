PR .= "-dream6"

do_install_append() {
        ln -s media/hdd ${D}/hdd

        rm -r ${D}/mnt
        ln -s media ${D}/mnt

        rmdir ${D}/tmp
        ln -s var/tmp ${D}/tmp

        ln -s var/run ${D}/run
}

FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

# Inject the /boot partition into /etc/fstab. At image creation time,
# this is done by IMAGE_CMD_jffs2.nfi (image_types_nfi.bbclass).
pkg_postinst_base-files() {
if [ -z "$D" ] && grep -q '\<root=/dev/mtdblock3\>' /proc/cmdline && ! grep -q '\s\+/boot\s\+' /etc/fstab; then
	printf '/dev/mtdblock2\t/boot\t\tjffs2\tro\t\t\t\t0 0\n' >> /etc/fstab
fi
}
