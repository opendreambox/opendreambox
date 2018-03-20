SUMMARY ?= "A Dreambox firmware image for headless systems"

python __anonymous() {
    pkgtype = d.getVar('IMAGE_PKGTYPE', True)
    if not oe.utils.inherits(d, 'package_%s' % pkgtype):
        pn = d.getVar('PN', True)
        raise bb.parse.SkipPackage("Unable to build %s without %s packages" % (pn, pkgtype))
}

BAD_RECOMMENDATIONS += " \
    libconnman-qt5-qmlplugins \
    libnss-mdns \
    qtbase-plugins \
    qtdeclarative-plugins \
    qtdeclarative-qmlplugins \
    qtwebkit-qmlplugins \
    systemd-extra-utils \
    udev-hwdb \
    wpa-supplicant-passphrase \
    xinetd \
"

# packages to drag into the image
IMAGE_INSTALL = " \
    packagegroup-boot-systemd \
    packagegroup-net-connman \
    packagegroup-pkg-deb \
    packagegroup-opendreambox-base \
    packagegroup-opendreambox-dvbapi3 \
"

# enable online package management
IMAGE_FEATURES = "empty-root-password package-management"

# we don't want any locales, at least not in the common way.
IMAGE_LINGUAS = ""

# 512MB rootfs
IMAGE_ROOTFS_SIZE_ext4 = "524288"

inherit image

DREAMBOX_IMAGE_DATE = "${@d.getVar('DATETIME', True)[:-2]}"
DREAMBOX_IMAGE_DATE[vardepsexclude] = "DATETIME"
# 0: Release, 1: Experimental
DREAMBOX_IMAGE_TYPE ?= "1"
# e.g. 400 for release 4.0.0, if IMAGE_TYPE=0
DREAMBOX_IMAGE_VERSION ?= "000"

opendreambox_rootfs_postprocess() {
    echo "version=${DREAMBOX_IMAGE_TYPE}${DREAMBOX_IMAGE_VERSION}${DREAMBOX_IMAGE_DATE}" > ${IMAGE_ROOTFS}${sysconfdir}/image-version
}

ROOTFS_POSTPROCESS_COMMAND += "opendreambox_rootfs_postprocess; "

require dreambox-image-nfo.inc
