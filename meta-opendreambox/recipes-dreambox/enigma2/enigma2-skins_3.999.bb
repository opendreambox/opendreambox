DESCRIPTION = "Skins for Enigma2"
LICENSE = "CLOSED"
SRCREV = "68c8f8d97f77c2a2101290a3f027c37fa6f34785"

inherit allarch autotools schwerkraft-git

PACKAGES_DYNAMIC = "enigma2-skin-*"
PACKAGES += "${PN}-meta"

FILES_${PN} += " /usr/share/enigma2 /usr/share/fonts "
FILES_${PN}-meta = "${datadir}/meta"

python populate_packages_prepend() {
        enigma2_skindir = bb.data.expand('${datadir}/enigma2', d)
        do_split_packages(d, enigma2_skindir, '(.*?)/.*', 'enigma2-skin-%s', 'Enigma2 Skin: %s', recursive=True, match_path=True, prepend=True)
}
python populate_packages_append() {
        enigma2_skindir = bb.data.expand('${datadir}/enigma2', d)
        #clear rdepends by default
        for package in bb.data.getVar('PACKAGES', d, 1).split():
                bb.data.setVar('RDEPENDS_' + package, '', d)
        #todo add support for control files in skindir.. like plugins
}
