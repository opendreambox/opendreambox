SUMMARY = "Skins for Enigma2"
LICENSE = "CLOSED"
SRCREV = "d50c3e73beab14488dab0cb97fba13b064de29b9"
PR = "r0"

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
        for package in d.getVar('PACKAGES', True).split():
                d.setVar('RDEPENDS_' + package, '')
        #todo add support for control files in skindir.. like plugins
}
