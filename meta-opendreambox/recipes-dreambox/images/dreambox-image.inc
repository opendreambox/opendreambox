SUMMARY = "A Dreambox firmware image"

# packages to build for the feed
DEPENDS = " \
	gdb \
	lsof \
	ltrace \
	strace \
"

PROVIDES = "dreambox-image"

python __anonymous() {
    pkgtype = d.getVar('IMAGE_PKGTYPE', d)
    if not oe.utils.inherits(d, 'package_%s' % pkgtype):
        pn = d.getVar('PN', d)
        raise bb.parse.SkipPackage("Unable to build %s without %s packages" % (pn, pkgtype))
}

BAD_RECOMMENDATIONS += "${@base_conditional('VIRTUAL-RUNTIME_init_manager', 'systemd', 'busybox-syslog', '', d)}"
BAD_RECOMMENDATIONS += "libnss-mdns udev-hwdb wpa-supplicant-passphrase xinetd"

VIRTUAL-RUNTIME_init_manager ?= "systemd"
VIRTUAL-RUNTIME_package_manager ?= "${IMAGE_PKGTYPE}"

SYSTEMD_DEFAULT_TARGET = "graphical.target"

# packages to drag into the image
IMAGE_INSTALL = " \
    packagegroup-boot-${VIRTUAL-RUNTIME_init_manager} \
    packagegroup-pkg-${VIRTUAL-RUNTIME_package_manager} \
    packagegroup-opendreambox-base \
    packagegroup-opendreambox-dvbapi3 \
    packagegroup-opendreambox-enigma2 \
"

# enable online package management
IMAGE_FEATURES = "empty-root-password package-management"

# we don't want any locales, at least not in the common way.
IMAGE_LINGUAS = ""

# 512MB rootfs
IMAGE_ROOTFS_SIZE_ext4 = "524288"

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

python dreambox_image_nfo() {
    def parse_status_file(filename, package):
        kv = dict()
        found = 0
        with open(filename, 'r') as f:
            for line in f.read().splitlines():
                try:
                    key, value = line.split(': ', 1)
                    if found == 0 and key == 'Package' and value == package:
                        found = 1
                    if found == 1:
                        kv[key] = value
                except:
                    if found == 1:
                        break
        return kv

    def hash_image(filename, algorithm):
        import hashlib
        h = hashlib.new(algorithm)
        with open(filename, 'r') as f:
            while True:
                buf = f.read(1024 * 1024)
                if len(buf) == 0:
                    return h.hexdigest()
                h.update(buf)
        return None

    def file_mtime(filename):
        from datetime import datetime
        dt = datetime.fromtimestamp(os.path.getmtime(filename))
        return dt.isoformat(' ')

    deploy_dir_image = d.getVar('DEPLOY_DIR_IMAGE', True)
    distro_feed_uri = d.getVar('DISTRO_FEED_URI', True)
    distro_name = d.getVar('DISTRO_NAME', True)
    distro_version = d.getVar('DISTRO_VERSION', True)
    image_fstypes = (d.getVar('IMAGE_FSTYPES', True) or "").split()
    image_name = d.getVar('IMAGE_NAME', True)
    image_pkgtype = d.getVar('IMAGE_PKGTYPE', True)
    image_rootfs = d.getVar('IMAGE_ROOTFS', True)
    machine = d.getVar('MACHINE', True)

    if oe.utils.inherits(d, 'image_types_nfi'):
        ext = 'nfi'
    elif len(image_fstypes) >= 1:
        ext = 'rootfs.%s' % image_fstypes[0]
    else:
        raise bb.build.FuncFailed('Invalid IMAGE_FSTYPES')

    image_path = os.path.join(deploy_dir_image, '.'.join((image_name, ext)))

    attr = dict()

    mtime = file_mtime(image_path)
    if mtime:
        attr['Date'] = mtime

    opkglibdir = d.getVar('OPKGLIBDIR', True)
    if opkglibdir:
        status_path = image_rootfs + opkglibdir + '/opkg/status'
    else:
        status_path = image_rootfs + '/var/lib/dpkg/status'

    control = parse_status_file(status_path, 'kernel-image')
    if 'Version' in control:
        if 'Provides' in control:
            attr['Kernel'] = ' '.join((control['Provides'], control['Version']))
        else:
            attr['Kernel'] = control['Version']

    control = parse_status_file(status_path, 'dreambox-dvb-modules')
    if 'Version' in control:
        attr['Drivers'] = control['Version']

    control = parse_status_file(status_path, 'enigma2')
    if 'Version' in control:
        attr['Enigma2'] = control['Version']

    if distro_name and distro_version:
        attr['Distro'] = ' '.join((distro_name, distro_version))

    if machine:
        attr['Machine'] = ' '.join(('Dreambox', machine.upper()))

    if distro_feed_uri and image_pkgtype:
        attr['Link'] = '/'.join((distro_feed_uri, image_pkgtype))

    md5 = hash_image(image_path, 'md5')
    if md5:
        attr['MD5'] = md5

    sha256 = hash_image(image_path, 'sha256')
    if sha256:
        attr['SHA256'] = sha256

    nfo_path = os.path.join(deploy_dir_image, '%s.nfo' % image_name)
    with open(nfo_path, 'w') as f:
        for key, value in sorted(attr.items()):
            f.write('%s: %s\n' % (key, value))
}

do_rootfs[postfuncs] += "dreambox_image_nfo"
