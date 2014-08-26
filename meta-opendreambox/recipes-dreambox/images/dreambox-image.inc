SUMMARY = "A Dreambox firmware image"

# packages to build for the feed
DEPENDS = " \
	gdb \
	lsof \
	ltrace \
	strace \
"

BAD_RECOMMENDATIONS += "${@base_conditional('VIRTUAL-RUNTIME_init_manager', 'systemd', 'busybox-syslog', '', d)}"
BAD_RECOMMENDATIONS += "${@base_conditional('VIRTUAL-RUNTIME_network_manager', 'connman', 'busybox-udhcpc', '', d)}"
BAD_RECOMMENDATIONS += "libnss-mdns udev-hwdb wpa-supplicant-passphrase xinetd"

VIRTUAL-RUNTIME_init_manager ?= "systemd"
VIRTUAL-RUNTIME_network_manager ?= "connman"
VIRTUAL-RUNTIME_package_manager ?= "${IMAGE_PKGTYPE}"

# packages to drag into the image
IMAGE_INSTALL = " \
    packagegroup-boot-${VIRTUAL-RUNTIME_init_manager} \
    packagegroup-net-${VIRTUAL-RUNTIME_network_manager} \
    packagegroup-pkg-${VIRTUAL-RUNTIME_package_manager} \
    packagegroup-opendreambox-base \
    packagegroup-opendreambox-dvbapi3 \
    packagegroup-opendreambox-enigma2 \
"

# enable online package management
IMAGE_FEATURES += "package-management"

# we don't want any locales, at least not in the common way.
IMAGE_LINGUAS = ""

# 512MB rootfs
IMAGE_ROOTFS_SIZE_ext4 = "524288"

# we dont like to call ldconfig on image build...
LDCONFIGDEPEND = ""

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
