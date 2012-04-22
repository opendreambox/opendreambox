SUMMARY = "Utilities needed to do transponder blindscan with dreambox dvb receivers"
DEPENDS = "ncurses"
INC_PR = "r1"

PACKAGES_DYNAMIC = "blindscan-*"

python populate_packages_prepend() {
        bindir = bb.data.expand('${bindir}', d)
        do_split_packages(d, bindir, '^(.*)$', 'blindscan-%s', 'scan tool for %s', extra_depends='', prepend=True)
        packages = d.getVar('PACKAGES', True).split()
        rdepends = []
        for pkg in packages:
                if not pkg.startswith('blindscan-utils'):
                        rdepends.append(pkg)
        d.setVar('RDEPENDS_blindscan-utils', ' '.join(rdepends))
}

ALLOW_EMPTY_${PN} = "1"
