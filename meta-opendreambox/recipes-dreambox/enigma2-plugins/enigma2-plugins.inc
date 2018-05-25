SUMMARY = "Additional plugins for Enigma2"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=8e37f34d0e40d32ea2bc90ee812c9131"
DEPENDS = "gettext-native python-requests"

inherit autotools-brokensep pythonnative

PACKAGES_DYNAMIC = "^enigma2-plugin-(extensions|systemplugins)-.*"
PACKAGES += "${PN}-meta"

FILES_${PN} = ""
FILES_${PN}-meta = "${datadir}/meta"

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
                            d.setVar('SUMMARY_%s' % package, value)
                        elif name in ('Breaks', 'Conflicts', 'Depends', 'Provides', 'Recommends', 'Replaces', 'Suggests'):
                            d.appendVar('R%s_%s' % (name.upper(), package), ' ' + ' '.join(value.split(', ')))
                    except:
                        bb.fatal("Error parsing control file for package %s" % package)

    srcdir = d.getVar('S', True)
    packages = d.getVar('PACKAGES', True).split()
    for package in packages:
        if package.startswith('enigma2-plugin-'):
            subdir = package.split('-')[-1]
            parseControlFile(package, os.path.join(srcdir, subdir))
}

PACKAGESPLITFUNCS_prepend = "enigma2_plugins_split_packages "

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
        enigma2 \
        enigma2-plugin-skincomponents-weathercomponent \
        enigma2-streamproxy \
        gstreamer1.0-plugins-bad-faad \
        gstreamer1.0-plugins-bad-fragmented \
        gstreamer1.0-plugins-good-flv \
        gstreamer1.0-plugins-good-icydemux \
        gstreamer1.0-plugins-good-spectrum \
        hdparm \
        libsss-segment \
        parted \
        python-autobahn \
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
        python-netclient \
        python-pyopenssl \
        python-re \
        python-shell \
        python-simplejson \
        python-subprocess \
        python-textutils \
        python-threading \
        python-transmissionrpc \
        python-twisted-core \
        python-twisted-mail \
        python-twisted-names \
        python-twisted-protocols \
        python-twisted-web \
        python-voluptuous \
        python-xml \
        python-youtube-dl \
        python-zlib \
        satip-client \
        shellinabox \
        smartmontools \
        streamripper \
"
