inherit image_types

UBINFI_BOOT = "${WORKDIR}/ubi-nfi/boot"
UBINFI_ROOT = "${WORKDIR}/ubi-nfi/rootfs"

IMAGE_CMD_ubi-nfi = " \
	rm -rf ${WORKDIR}/ubi-nfi; \
	mkdir -p ${UBINFI_ROOT}; \
	tar --xattrs --xattrs-include='*' -cf - -C ${IMAGE_ROOTFS} --exclude=./boot/* -p . | tar --xattrs --xattrs-include='*' -xf - -C ${UBINFI_ROOT}; \
	mkdir -p ${UBINFI_BOOT}; \
	tar --xattrs --xattrs-include='*' -cf - -C ${IMAGE_ROOTFS}/boot -p . | tar --xattrs --xattrs-include='*' -xf - -C ${UBINFI_BOOT}; \
	mkfs.jffs2 \
		--root=${UBINFI_BOOT} \
		--disable-compressor=lzo \
		--compression-mode=size \
		--output=${DEPLOY_DIR_IMAGE}/${IMAGE_NAME}.boot.jffs2 \
		${EXTRA_IMAGECMD}; \
	printf '/dev/mtdblock2\t/boot\t\tjffs2\tro\t\t\t\t0 0\n' >> ${UBINFI_ROOT}/etc/fstab; \
	echo \[root\] > ubinize.cfg; \
	echo mode=ubi >> ubinize.cfg; \
	echo image=${DEPLOY_DIR_IMAGE}/${IMAGE_NAME}.rootfs.ubifs >> ubinize.cfg; \
	echo vol_id=0 >> ubinize.cfg; \
	echo vol_name=${UBI_VOLNAME} >> ubinize.cfg; \
	echo vol_type=dynamic >> ubinize.cfg; \
	if [ ${UBINIZE_VOLSIZE} = "0" ]; then \
		echo vol_flags=autoresize >> ubinize.cfg; \
	else \
		echo vol_size=${UBINIZE_VOLSIZE} >> ubinize.cfg; \
		if [ ${UBINIZE_DATAVOLSIZE} != "0" ]; then \
			echo \[data\] >> ubinize.cfg; \
			echo mode=ubi >> ubinize.cfg; \
			echo vol_id=1 >> ubinize.cfg; \
			echo vol_type=dynamic >> ubinize.cfg; \
			echo vol_name=data >> ubinize.cfg; \
			echo vol_size=${UBINIZE_DATAVOLSIZE} >> ubinize.cfg; \
			echo vol_flags=autoresize >> ubinize.cfg; \
			printf '/dev/ubi0_1\t/data\t\tubifs\trw,nofail\t\t\t\t0 0\n' >> ${UBINFI_ROOT}/etc/fstab; \
			install -d ${UBINFI_ROOT}/data; \
		fi; \
	fi; \
	mkfs.ubifs \
		-r ${UBINFI_ROOT} \
		-o ${DEPLOY_DIR_IMAGE}/${IMAGE_NAME}.rootfs.ubifs \
		${MKUBIFS_ARGS}; \
	ubinize -o ${DEPLOY_DIR_IMAGE}/${IMAGE_NAME}.rootfs.ubi ${UBINIZE_ARGS} ubinize.cfg; \
	${DREAMBOX_BUILDIMAGE} \
		--boot-partition ${DREAMBOX_PART0_SIZE}:${STAGING_DATADIR}/dreambox-secondstage/secondstage.bin \
		--data-partition ${DREAMBOX_PART1_SIZE}:${DEPLOY_DIR_IMAGE}/${IMAGE_NAME}.boot.jffs2 \
		--data-partition ${DREAMBOX_PART2_SIZE}:${DEPLOY_DIR_IMAGE}/${IMAGE_NAME}.rootfs.ubi \
		> ${DEPLOY_DIR_IMAGE}/${IMAGE_NAME}.nfi; \
"

EXTRA_IMAGECMD_ubi-nfi ?= "-e ${DREAMBOX_ERASE_BLOCK_SIZE} -n -l"

IMAGE_DEPENDS_ubi-nfi = "${IMAGE_DEPENDS_ubi} ${IMAGE_DEPENDS_ubifs} dreambox-buildimage-native"

IMAGE_TYPES += "ubi-nfi"

runimagecmd_append() {
    if [ -n "${IMAGE_LINK_NAME}" ]; then
        if [ -e ${IMAGE_NAME}.nfi ]; then
            ln -s ${IMAGE_NAME}.nfi ${DEPLOY_DIR_IMAGE}/${IMAGE_LINK_NAME}.nfi
        fi
    fi
}
