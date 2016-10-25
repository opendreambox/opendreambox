PACKAGES_DYNAMIC = "^mtd-utils-.*"

FILES_${PN} = ""
ALLOW_EMPTY_${PN} = "1"

python mtdutils_split_packages() {
    objs = d.expand('${sbindir}')
    do_split_packages(d, objs, '^(.*)$', 'mtd-utils-%s', 'mtd-util %s', recursive=False, match_path=True, prepend=True)
}

PACKAGESPLITFUNCS_prepend = "mtdutils_split_packages "
