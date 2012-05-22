SUMMARY = "A Dreambox firmware image"

# packages to build for the feed
DEPENDS = " \
	gdb \
	lsof \
	ltrace \
	strace \
"

BAD_RECOMMENDATIONS += "libnss-mdns wpa-supplicant-passphrase"

TASK_CORE_BOOT ?= "task-core-boot"
TASK_OPENDREAMBOX_BASE ?= "task-opendreambox-base"
TASK_OPENDREAMBOX_DVBAPI ?= "task-opendreambox-dvbapi3"
TASK_OPENDREAMBOX_ENIGMA ?= "task-opendreambox-enigma2"

# packages to drag into the image
IMAGE_INSTALL = " \
	${TASK_CORE_BOOT} ${ROOTFS_PKGMANAGE} \
	${TASK_OPENDREAMBOX_BASE} \
	${TASK_OPENDREAMBOX_DVBAPI} \
	${TASK_OPENDREAMBOX_ENIGMA} \
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
