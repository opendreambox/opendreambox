#
# xinetd.bbclass
#

DEPENDS += "xinetd"

do_install_append() {
	install -d ${D}${sysconfdir}/xinetd.d
	for srcfile in ${WORKDIR}/*.xinetd.in; do
		dstfile=`basename $srcfile .xinetd.in`
		sed -e 's,@BINDIR@,${bindir},' \
		    -e 's,@SBINDIR@,${sbindir},' \
		    $srcfile > ${D}${sysconfdir}/xinetd.d/$dstfile
		chmod 644 ${D}${sysconfdir}/xinetd.d/$dstfile
	done
}

xinetd_reload() {
[ -z "$D" ] && PID=`pidof xinetd` && kill -HUP $PID || true
}

python populate_packages_append () {
	packages = d.getVar('PACKAGES', True).split()
	pkgdest = d.getVar('PKGDEST', True)
	sysconfdir = d.getVar('sysconfdir', True)

	for pkg in packages:
		xinetd_dir = '%s/%s/%s/xinetd.d' % (pkgdest, pkg, sysconfdir)
		if not os.path.exists(xinetd_dir):
			continue

		bb.note("adding xinetd dependency to %s" % pkg)

		rdepends = d.getVar('RDEPENDS_%s' % pkg, True)
		if rdepends:
			rdepends += " "
		rdepends += "xinetd"
		d.setVar('RDEPENDS_%s' % pkg, rdepends)

		bb.note('adding xinetd postinst and postrm scripts to %s' % pkg)

		postinst = d.getVar('pkg_postinst_%s' % pkg, True) or d.getVar('pkg_postinst', True)
		if not postinst:
			postinst = '#!/bin/sh\n'
		postinst += d.getVar('xinetd_reload', True)
		d.setVar('pkg_postinst_%s' % pkg, postinst)

		postrm = d.getVar('pkg_postrm_%s' % pkg, True) or d.getVar('pkg_postrm', True)
		if not postrm:
			postrm = '#!/bin/sh\n'
		postrm += d.getVar('xinetd_reload', True)
		d.setVar('pkg_postrm_%s' % pkg, postrm)
}
