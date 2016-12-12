PACKAGES_DYNAMIC = "^mtd-utils-.*"

FILES_${PN} = ""
ALLOW_EMPTY_${PN} = "1"

python mtdutils_split_packages() {
    def split_hook(f, pkg, file_regex, output_pattern, modulename):
        pn = d.getVar('PN', True)
        d.appendVar('RRECOMMENDS_' + pn, ' ' + pkg)

    objs = d.expand('${sbindir}')
    do_split_packages(d, objs, '^(.*)$', 'mtd-utils-%s', '%s (mtd-utils)', recursive=False, hook=split_hook, extra_depends='', prepend=True)
}

PACKAGESPLITFUNCS_prepend = "mtdutils_split_packages "
