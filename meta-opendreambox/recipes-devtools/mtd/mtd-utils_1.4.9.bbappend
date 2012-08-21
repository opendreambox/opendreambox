PR .= "-dream2"

FILESEXTRAPATHS_prepend := "${THISDIR}/${P}:"

SRC_URI += "${@base_version_less_or_equal('DREAMBOX_KERNEL_VERSION', '2.6.18', 'file://disable-ubi.patch', '', d)}"

PACKAGES_DYNAMIC = "mtd-utils-*"

python populate_packages_prepend () {
	debug_objs = d.expand('${sbindir}/.debug')
	do_split_packages(d, debug_objs, '^(.*)$', 'mtd-utils-%s-dbg', 'mtd-util-dbg %s', recursive=False, match_path=True, prepend=True, extra_depends='')
	objs = d.expand('${sbindir}')
	do_split_packages(d, objs, '^(.*)$', 'mtd-utils-%s', 'mtd-util %s', recursive=False, match_path=True, prepend=True, extra_depends='')
}
