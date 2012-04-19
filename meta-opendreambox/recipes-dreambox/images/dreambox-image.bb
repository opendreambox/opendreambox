DESCRIPTION = "A Dreambox firmware image"

# packages to build for the feed
DEPENDS = " \
	gdb \
	lsof \
	ltrace \
	openvpn \
	strace \
"

# packages to drag into the image
IMAGE_INSTALL = " \
	task-core-boot ${ROOTFS_PKGMANAGE} \
	task-opendreambox-base \
	task-opendreambox-dvbapi3 \
	task-opendreambox-enigma2 \
"

# enable online package management
IMAGE_FEATURES += "package-management"

# we don't want any locales, at least not in the common way.
IMAGE_LINGUAS = ""

inherit image

opendreambox_rootfs_postprocess() {
    # generate /etc/image-version
    IMAGE_DATE=`date +%Y%m%d%H%M`
    # 0: Release, 1: Experimental
    IMAGE_TYPE="1"
    # e.g. 400 for release 4.0.0, if IMAGE_TYPE=0
    IMAGE_VERSION="000"
    echo "version=${IMAGE_TYPE}${IMAGE_VERSION}${IMAGE_DATE}" > ${IMAGE_ROOTFS}/etc/image-version
}

ROOTFS_POSTPROCESS_COMMAND += "opendreambox_rootfs_postprocess; "

do_rootfs_append() {
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
}
