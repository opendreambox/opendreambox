do_install_append () {
	for i in ext2 ext3 ext4 ext4dev; do
		ln -sf e2fsck ${D}${base_sbindir}/fsck.${i}
		ln -sf mke2fs ${D}${base_sbindir}/mkfs.${i}
	done;
}
