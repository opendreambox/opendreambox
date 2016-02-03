SUMMARY = "Skins for Enigma2"
LICENSE = "CLOSED"
SRCREV = "92db49a9d83851fe9f348b8263c1156706c3e21e"
SCHWERKRAFT_BRANCH = "4.0"
PE = "1"

inherit allarch autotools opendreambox-github

PACKAGES_DYNAMIC = "enigma2-skin-*"
PACKAGES += "${PN}-meta"

FILES_${PN} += " /usr/share/enigma2 /usr/share/fonts "
FILES_${PN}-meta = "${datadir}/meta"

python populate_packages_prepend() {
        output_pattern = 'enigma2-skin-%s'
        enigma2_skindir = os.path.join(d.getVar('datadir', True), 'enigma2')
        do_split_packages(d, enigma2_skindir, '(.*?)/.*', output_pattern, 'Enigma2 Skin: %s', recursive=True, extra_depends='', prepend=True, match_path=True)

        def parseControlFile(pkg, skindir):
                filename = os.path.join(skindir, 'CONTROL/control')
                if os.path.exists(filename):
                        src = open(filename).read()
                        for line in src.splitlines():
                                name, value = line.strip().split(': ', 1)
                                if name == 'Description':
                                        d.setVar('DESCRIPTION_%s' % pkg, value)
                                elif name == 'Depends':
                                        d.setVar('RDEPENDS_%s' % pkg, ' '.join(value.split(', ')))
                                elif name == 'Replaces':
                                        d.setVar('RREPLACES_%s' + pkg, ' '.join(value.split(', ')))
                                elif name == 'Conflicts':
                                        d.setVar('RCONFLICTS_%s' + pkg, ' '.join(value.split(', ')))

        skinsdir = os.path.join(d.getVar('S', True), 'skins')
        packages = d.getVar('PACKAGES', True).split()
        for subdir in os.walk(skinsdir).next()[1]:
                pkg = output_pattern % legitimize_package_name(subdir)
                if pkg in packages:
                        parseControlFile(pkg, os.path.join(skinsdir, subdir))
}
