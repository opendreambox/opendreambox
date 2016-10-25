SUMMARY = "Additional plugins for Enigma2"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=8e37f34d0e40d32ea2bc90ee812c9131"
DEPENDS = "enigma2 gstreamer1.0 openssl"

SRC_URI += "file://print.mak"

inherit autotools-brokensep pkgconfig pythonnative

export BUILD_SYS
export HOST_SYS
export STAGING_INCDIR
export STAGING_LIBDIR

do_install_append() {
        # create lists of files installed outside of "${libdir}/enigma2/python/Plugins" or "${datadir}/meta"
        rm -rf ${INSTALL_ROOTDIR}
        install -d ${INSTALL_ROOTDIR}
        SUBDIRS=`make -f Makefile -f ${WORKDIR}/print.mak print-SUBDIRS`
        for SUBDIR in $SUBDIRS; do
                oe_runmake -C $SUBDIR "DESTDIR=${INSTALL_DESTDIR}" install
                CATEGORY=`ls -1 ${INSTALL_PLUGINSDIR} | head -n1 | tr '[:upper:]' '[:lower:]'`
                NAME=`echo $SUBDIR | tr '[:upper:]' '[:lower:]'`
                PKG="enigma2-plugin-$CATEGORY-$NAME"
                rm -rf ${INSTALL_METADIR} ${INSTALL_PODIR} ${INSTALL_PLUGINSDIR}
                find ${INSTALL_DESTDIR} -type f -name "*.la" -delete
                find ${INSTALL_DESTDIR} -type f -fprintf ${INSTALL_ROOTDIR}/$PKG '/%P\n'
                [ -s ${INSTALL_ROOTDIR}/$PKG ] || rm ${INSTALL_ROOTDIR}/$PKG
                rm -rf ${INSTALL_DESTDIR}
        done

        # delete unwanted files
        find ${D} -type f -name "*.la" -delete
}

PACKAGES_DYNAMIC = "enigma2-plugin-*"
PACKAGES += "${PN}-meta ${PN}-po"

FILES_${PN} = ""
FILES_${PN}-meta = "${datadir}/meta"
FILES_${PN}-po = "${datadir}/enigma2/po"

python enigma2_plugins_split_packages() {
    enigma2_plugindir = bb.data.expand('${libdir}/enigma2/python/Plugins', d)
    do_split_packages(d, enigma2_plugindir, '^(\w+/\w+)', 'enigma2-plugin-%s', '%s', recursive=True, extra_depends='enigma2', match_path=True)

    def parseControlFile(package, dir):
        filename = os.path.join(dir, 'CONTROL/control')
        if os.path.exists(filename):
            with open(filename) as f:
                for line in f.read().splitlines():
                    try:
                        name, value = line.strip().split(': ', 1)
                        if name == 'Description':
                            d.setVar('DESCRIPTION_%s' % package, value)
                        elif name == 'Depends':
                            d.appendVar('RDEPENDS_%s' % package, ' ' + ' '.join(value.split(', ')))
                        elif name == 'Replaces':
                            d.setVar('RREPLACES_%s' % package, ' '.join(value.split(', ')))
                        elif name == 'Conflicts':
                            d.setVar('RCONFLICTS_%s' % package, ' '.join(value.split(', ')))
                    except:
                        bb.fatal("Error parsing control file for package %s" % package)

    def parseFileList(package, dir):
        filename = os.path.join(dir, package)
        if os.path.exists(filename):
            varname = 'FILES_%s' % package
            files = (d.getVar(varname, True) or "").split()
            with open(filename) as f:
                for line in f.read().splitlines():
                    if not line in files:
                        files.append(line)
            d.setVar(varname, ' '.join(files))

    tempdir = d.getVar('INSTALL_ROOTDIR', True)
    srcdir = d.getVar('S', True)
    packages = d.getVar('PACKAGES', True).split()
    for package in packages:
        if package.startswith('enigma2-plugin-'):
            subdir = package.split('-')[-1]
            parseFileList(package, tempdir)
            parseControlFile(package, os.path.join(srcdir, subdir))
}

PACKAGESPLITFUNCS_prepend = "enigma2_plugins_split_packages "

INSTALL_ROOTDIR = "${WORKDIR}/${PN}-packaging-tempdir"
INSTALL_DESTDIR = "${INSTALL_ROOTDIR}/destdir"
INSTALL_METADIR = "${INSTALL_DESTDIR}${datadir}/meta"
INSTALL_PODIR = "${INSTALL_DESTDIR}${datadir}/enigma2/po"
INSTALL_PLUGINSDIR = "${INSTALL_DESTDIR}${libdir}/enigma2/python/Plugins"

# This list of packages is compiled from all 'Depends' fields in all control
# files found in the enigma2-plugins repository. If a dependency gets added
# there, add it here, too. This allows to keep build dependencies minimal
# while making sure that all runtime dependencies are available.
# As ${PN} doesn't contain any files and ALLOW_EMPTY isn't set, this list
# actually has no impact on any generated packages.
RDEPENDS_${PN} = " \
        aio-grab \
        avahi-daemon \
        cdrkit \
        cdtextinfo \
        dbttcd \
        dvdbackup \
        enigma2-streamproxy \
        gstreamer1.0-plugins-bad-faad \
        gstreamer1.0-plugins-bad-fragmented \
        gstreamer1.0-plugins-good-flv \
        gstreamer1.0-plugins-good-icydemux \
        gstreamer1.0-plugins-good-spectrum \
        hdparm \
        parted \
        python-codecs \
        python-compression \
        python-crypt \
        python-difflib \
        python-email \
        python-flickrapi \
        python-gdata \
        python-google-api-client \
        python-html \
        python-io \
        python-json \
        python-lang \
        python-misc \
        python-mutagen \
        python-netclient \
        python-pycrypto \
        python-pyopenssl \
        python-re \
        python-shell \
        python-simplejson \
        python-sqlite3 \
        python-subprocess \
        python-textutils \
        python-threading \
        python-transmissionrpc \
        python-twisted-core \
        python-twisted-mail \
        python-twisted-names \
        python-twisted-protocols \
        python-twisted-web \
        python-xml \
        python-xmlrpc \
        python-youtube-dl \
        python-zlib \
        satip-client \
        smartmontools \
        streamripper \
"
