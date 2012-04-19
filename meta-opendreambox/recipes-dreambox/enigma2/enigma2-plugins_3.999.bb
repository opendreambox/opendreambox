DESCRIPTION = "Additional plugins for Enigma2"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=8e37f34d0e40d32ea2bc90ee812c9131"
DEPENDS = "enigma2 python-daap python-gdata python-mutagen python-pycrypto python-pyopenssl streamripper"
SRCREV = "bb4b44665e744b0c64399dcc674ecac97a4bcbfd"
PR = "r0"

SRC_URI += "file://cdinfo_depends.patch"

inherit autotools schwerkraft-git

EXTRA_OECONF = " \
        BUILD_SYS=${BUILD_SYS} \
        HOST_SYS=${HOST_SYS} \
        STAGING_INCDIR=${STAGING_INCDIR} \
        STAGING_LIBDIR=${STAGING_LIBDIR} \
"

PACKAGES_DYNAMIC = "enigma2-plugin-*"
PACKAGES += "${PN}-meta"

FILES_${PN} += "${datadir}/enigma2 ${datadir}/fonts"
FILES_${PN}-meta = "${datadir}/meta"

python populate_packages_prepend() {
        enigma2_plugindir = bb.data.expand('${libdir}/enigma2/python/Plugins', d)
        do_split_packages(d, enigma2_plugindir, '^(\w+/\w+)', 'enigma2-plugin-%s', '%s', recursive=True, match_path=True, prepend=True)
        do_split_packages(d, enigma2_plugindir, '^(\w+/\w+).*/.*\.la$', 'enigma2-plugin-%s-dev', '%s (development)', recursive=True, match_path=True, prepend=True)
        do_split_packages(d, enigma2_plugindir, '^(\w+/\w+).*/.*\.a$', 'enigma2-plugin-%s-staticdev', '%s (static development)', recursive=True, match_path=True, prepend=True)
        do_split_packages(d, enigma2_plugindir, '^(\w+/\w+).*/\.debug/', 'enigma2-plugin-%s-dbg', '%s (debug)', recursive=True, match_path=True, prepend=True)
        def parseControlFile(dir, d, package):
                import os
                src = open(dir + "/" + package.split('-')[-1] + "/CONTROL/control").read()
                for line in src.splitlines():
                        name, value = line.strip().split(': ', 1)
                        if name == 'Description':
                                bb.data.setVar('DESCRIPTION_' + package, value, d)
                        elif name == 'Depends':
                                bb.data.setVar('RDEPENDS_' + package, ' '.join(value.split(', ')), d)
                        elif name == 'Replaces':
                                bb.data.setVar('RREPLACES_' + package, ' '.join(value.split(', ')), d)
                        elif name == 'Conflicts':
                                bb.data.setVar('RCONFLICTS_' + package, ' '.join(value.split(', ')), d)
        srcdir = bb.data.getVar('S', d, 1)
        for package in bb.data.getVar('PACKAGES', d, 1).split():
                if package.startswith('enigma2-plugin-') and not package.endswith('-dev') and not package.endswith('-dbg') and not package.endswith('-staticdev'):
                        parseControlFile(srcdir, d, package)
}
