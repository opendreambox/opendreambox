DESCRIPTION = "Utilities needed to do transponder blindscan with dreambox dvb receivers"
DEPENDS = "ncurses"
INC_PR = "r0"

PACKAGES_DYNAMIC = "blindscan-*"

python populate_packages_prepend() {
        bindir = bb.data.expand('${bindir}', d)
        do_split_packages(d, bindir, '^(.*)$', 'blindscan-%s', 'scan tool for %s', extra_depends='', prepend=True)
        packages = bb.data.getVar('PACKAGES', d, 1).split()
        rdepends = []
        for pkg in packages:
                if not pkg.startswith('blindscan-utils'):
                        rdepends.append(pkg)
        bb.data.setVar('RDEPENDS_blindscan-utils', ' '.join(rdepends), d)
}

ALLOW_EMPTY_${PN} = "1"
