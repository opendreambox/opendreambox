SUMMARY = "Skins for Enigma2"
LICENSE = "CLOSED"
SRCREV = "${@opendreambox_srcrev('a84ca719a20a44bc61d0151ce161a5e0652f53ea', d)}"

inherit allarch autotools-brokensep opendreambox-github

PACKAGES_DYNAMIC = "^enigma2-skin-.*"
PACKAGES += "${PN}-meta"

FILES_${PN} = ""
FILES_${PN}-meta = "${datadir}/meta"

python enigma2_skins_split_packages() {
    output_pattern = 'enigma2-skin-%s'
    enigma2_skindir = os.path.join(d.getVar('datadir', True), 'enigma2')
    do_split_packages(d, enigma2_skindir, '(.*?)/.*', output_pattern, 'Enigma2 Skin: %s', recursive=True, extra_depends='enigma2', match_path=True)

    def parseControlFile(package, dir):
        filename = os.path.join(dir, 'CONTROL/control')
        if os.path.exists(filename):
            with open(filename) as f:
                for line in f.read().splitlines():
                    try:
                        name, value = line.strip().split(': ', 1)
                        if name == 'Description':
                            d.setVar('DESCRIPTION_%s' % package, value)
                        elif name in ('Breaks', 'Conflicts', 'Depends', 'Provides', 'Recommends', 'Replaces', 'Suggests'):
                            d.appendVar('R%s_%s' % (name.upper(), package), ' ' + ' '.join(value.split(', ')))
                    except:
                        bb.fatal("Error parsing control file for package %s" % package)

    srcdir = os.path.join(d.getVar('S', True), 'skins')
    packages = d.getVar('PACKAGES', True).split()
    for subdir in next(os.walk(srcdir))[1]:
        package = output_pattern % legitimize_package_name(subdir)
        if package in packages:
            parseControlFile(package, os.path.join(srcdir, subdir))
}

PACKAGESPLITFUNCS_prepend = "enigma2_skins_split_packages "

# This list of packages is compiled from all 'Depends' fields in all control
# files found in the enigma2-skins repository. If a dependency gets added
# there, add it here, too. This allows to keep build dependencies minimal
# while making sure that all runtime dependencies are available.
# As ${PN} doesn't contain any files and ALLOW_EMPTY isn't set, this list
# actually has no impact on any generated packages.
RDEPENDS_${PN} = " \
    enigma2 \
    enigma2-plugin-skincomponents-channelselectionshorttitle \
    enigma2-plugin-skincomponents-eventlist \
    enigma2-plugin-skincomponents-eventposition \
    enigma2-plugin-skincomponents-reftopiconname \
    enigma2-plugin-skincomponents-serviceresolution \
"
