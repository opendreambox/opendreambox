IMAGE_PKGTYPE = "ipk"

require conf/machine/include/dreambox-nand-1024mb-2k.inc

require dreambox-image.inc

IMAGE_NAME = "${IMAGE_BASENAME}-${DATETIME}"
IMAGE_LINK_NAME = "${IMAGE_BASENAME}"

do_rootfs_append() {
    if [ -e ${DEPLOY_DIR_IMAGE}/${IMAGE_NAME}.nfi ]; then
        VER=`grep ^Version: ${IMAGE_ROOTFS}${opkglibdir}/info/enigma2.control | cut -d ' ' -f 2`
        DATE=`date -r ${DEPLOY_DIR_IMAGE}/${IMAGE_NAME}.nfi -u '+%F %R'`
        MD5=`md5sum ${DEPLOY_DIR_IMAGE}/${IMAGE_NAME}.nfi | cut -d ' ' -f 1`
        SHA256=`sha256sum ${DEPLOY_DIR_IMAGE}/${IMAGE_NAME}.nfi | cut -d ' ' -f 1`
        # In addition to the fields below, you may add 'Issuer' and 'Description'.
        echo "Date: $DATE" > ${DEPLOY_DIR_IMAGE}/${IMAGE_NAME}.nfo
        echo "Enigma2: $VER" >> ${DEPLOY_DIR_IMAGE}/${IMAGE_NAME}.nfo
        echo "Distro: ${DISTRO_NAME} ${DISTRO_VERSION}" >> ${DEPLOY_DIR_IMAGE}/${IMAGE_NAME}.nfo
        echo "Machine: Dreambox ${MACHINE}" >> ${DEPLOY_DIR_IMAGE}/${IMAGE_NAME}.nfo
        echo "Link: ${DISTRO_FEED_URI}" >> ${DEPLOY_DIR_IMAGE}/${IMAGE_NAME}.nfo
        echo "MD5: $MD5" >> ${DEPLOY_DIR_IMAGE}/${IMAGE_NAME}.nfo
        echo "SHA256: $SHA256" >> ${DEPLOY_DIR_IMAGE}/${IMAGE_NAME}.nfo
    fi
}
