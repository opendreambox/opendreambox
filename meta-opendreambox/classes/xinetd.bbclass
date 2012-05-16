#
# xinetd.bbclass
#

DEPENDS += "xinetd"

XINETD_PACKAGES ??= "${PN}-xinetd"

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

def xinetd_after_parse(d):
	def xinetd_create_package(pkg):
		packages = d.getVar('PACKAGES', True).split()
		if not pkg in packages:
			packages.insert(0, pkg)
			d.setVar('PACKAGES', ' '.join(packages))

	bpn = d.getVar('BPN', 1)
	if bpn + "-native" != d.getVar('PN', 1) and \
	   bpn + "-cross" != d.getVar('PN', 1) and \
	   bpn + "-nativesdk" != d.getVar('PN', 1):
		for pkg in d.getVar('XINETD_PACKAGES', True).split():
			xinetd_create_package(pkg)

python __anonymous() {
	xinetd_after_parse(d)
}

python populate_packages_prepend () {
	def xinetd_generate_package_scripts(pkg):
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

	def xinetd_add_rdepends(pkg):
		bb.note("adding xinetd dependency to %s" % pkg)

		rdepends = (d.getVar('RDEPENDS_%s' % pkg, True) or "").split()
		if pkg.endswith('-xinetd'):
			basepkg = pkg[:-len('-xinetd')]
			if not basepkg in rdepends:
				rdepends.append(basepkg)
		if not 'xinetd' in rdepends:
			rdepends.append('xinetd')
		d.setVar('RDEPENDS_%s' % pkg, ' '.join(rdepends))

	def xinetd_add_rconflicts(pkg):
		bb.note("adding xinetd conflicts to %s" % pkg)

		if pkg.endswith('-xinetd'):
			rconflicts = (d.getVar('RCONFLICTS_%s' % pkg, True) or "").split()
			conflictpkg = pkg[:-len('-xinetd')] + '-systemd'
			if not conflictpkg in rconflicts:
				rconflicts.append(conflictpkg)
			d.setVar('RCONFLICTS_%s' % pkg, ' '.join(rconflicts))

	# run all modifications once when creating package
	xinetd_dir = '%s/xinetd.d' % d.getVar('sysconfdir', True)
	if os.path.exists('${D}' + xinetd_dir):
		for pkg in d.getVar('XINETD_PACKAGES', True).split():
			services = d.getVar('XINETD_SERVICE_%s' % pkg, True) or d.getVar('XINETD_SERVICE', True) or ""
			if services:
				xinetd_generate_package_scripts(pkg)
				xinetd_add_rdepends(pkg)
				xinetd_add_rconflicts(pkg)

			for service in services.split():
				file_append = '%s/%s' % (xinetd_dir, service)
				if os.path.exists('${D}' + file_append):
					var_name = 'FILES_%s' % pkg
					files = (d.getVar(var_name, False) or "").split()
					if file_append not in files:
						files.append(file_append)
						d.setVar(var_name, ' '.join(files))
}
