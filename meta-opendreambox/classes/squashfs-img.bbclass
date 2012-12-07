SQUASHFS_IMG_NAMES ?= ""
SQUASHFS_IMG_REPLACES ?= ""
SQUASHFS_IMG_BLOCKSIZES ?= ""
SQUASHFS_IMG_FILESREGEX ?= ""
SQUASHFS_IMG_COMPRESSOR ?= ""
SQUASHFS_IMG_SUPPORT_ENABLED ?= "${@base_less_or_equal('DREAMBOX_IMAGE_SIZE', 64, 1, 0, d)}"
SQUASHFS_IMG_PR_INC ?= "-sqsh0"

DEPENDS += '${@base_contains('SQUASHFS_IMG_SUPPORT_ENABLED', '1', 'squashfs-tools-native dreambox-squashfs-support', '', d)}'

PACKAGE_ARCH := "${@base_contains('SQUASHFS_IMG_SUPPORT_ENABLED', '1', '${MACHINE_ARCH}', '${PACKAGE_ARCH}', d)}"

PR .= "${@base_contains('SQUASHFS_IMG_SUPPORT_ENABLED', '1', '${SQUASHFS_IMG_PR_INC}', '', d)}"

python emit_pkgdata_prepend() {
	import os, subprocess, glob, re, shutil
	enabled = d.getVar('SQUASHFS_IMG_SUPPORT_ENABLED', True)

	if enabled != '1':
		bb.note('squashfs-image-support is disabled..')
	else:
		def makedirs(dir):
			try:
				os.makedirs(dir)
			except:
				pass

		def rename(src, dest):
			try:
				os.rename(src, dest)
			except:
				pass

		def symlink(source, link_name):
			try:
				os.symlink(source, link_name)
			except:
				pass

		def rmtree(path):
			try:
				shutil.rmtree(path)
			except:
				pass

		packages = d.getVar('PACKAGES', True).split(' ')
		packagesdir = d.getVar('PKGDEST', True)

		package_names = d.getVar('SQUASHFS_IMG_PACKAGES', True).split(':')
		package_replaces = d.getVar('SQUASHFS_IMG_REPLACES', True).split(':')
		package_blocksizes = d.getVar('SQUASHFS_IMG_BLOCKSIZES', True).split(':')
		package_filesregex = d.getVar('SQUASHFS_IMG_FILESREGEX', True).split(':')
		package_compressor = d.getVar('SQUASHFS_IMG_COMPRESSOR', True)

		if not package_compressor:
			kernel_version = d.getVar('DREAMBOX_KERNEL_VERSION', True)
			package_compressor = kernel_version <= '2.6.18' and 'lzma' or 'xz'

		num_replaces = len(package_replaces)
		num_blocksizes = len(package_blocksizes)
		num_filesregex = len(package_filesregex)
		idx = 0

		for package in package_names:
			bb.note('building squashfs img %s' %package)

			package_files = [ ]
			squashfs_files = [ ]
			packagedir = packagesdir+'/'+package

			if num_replaces <= idx:
				bb.fatal('no replaces for %s' %package)

			replaces = package_replaces[idx].split(' ')
			replaces = [ repl.strip('\t ') for repl in replaces if repl.strip('\t ') ]

			blocksize = ''
			if num_blocksizes > idx:
				blocksize = package_blocksizes[idx]
			if blocksize == '':
				blocksize = str(128*1024)

			if num_filesregex > idx:
				filesregex = package_filesregex[idx]

			if filesregex != '':
				filesre = re.compile(filesregex)
			else:
				filesre = None

			bb.note('replaces %s, blocksize %s, file_regex %s' %(replaces, blocksize, filesregex))

			for repl in replaces:
				bb.note('process replacement %s' %repl)
				try:
					files_pathes = d.getVar('FILES_%s'%repl, True).split(' ')
					files_pathes = [ p.strip('\t ') for p in files_pathes ]
				except:
					bb.fatal('couldnt retrieve FILES_%s!' %repl)
				repldir = packagesdir+'/'+repl
				bb.note('FILES_%s %s' %(repl, files_pathes))

				l = len(repldir)
				for path in files_pathes:
					if path.startswith('/etc'):
						continue
					realp = repldir+path
					for realpath in glob.glob(realp):
						if os.path.isdir(realpath):
							files = []
							for root, dirs, names in os.walk(realpath):
								files += [ root+'/'+name for name in names ]
						else:
							if os.path.islink(realpath):
								continue
							files = glob.glob(realpath)
						files = [ (f, l) for f in files if not os.path.islink(f) and (not filesre or filesre.search(f) is not None) ]
						squashfs_files += files

			if not squashfs_files:
				bb.fatal("no squashfs files ... maybe regex wrong?!?")

			bb.note('squashfs_files %s' %[ f for f, l in squashfs_files ])

			makedirs(packagedir+'/media/squashfs-images/'+package)
			makedirs(packagedir+'/squashfs-images')

			for f, l in squashfs_files:
				makedirs(packagedir+'/tmp'+os.path.dirname(f)[l:])
				rename(f, packagedir+'/tmp'+f[l:])
				symlink('/media/squashfs-images/'+package+f[l:], f)

			squashfs_cmd = ['mksquashfs']
			squashfs_cmd.append(packagedir+'/tmp/')
			squashfs_cmd.append(packagedir+'/squashfs-images/'+package)
			squashfs_cmd.append('-b')
			squashfs_cmd.append('%s' %blocksize)
			squashfs_cmd.append('-comp')
			squashfs_cmd.append('%s' %package_compressor)

			bb.note('squashfs_cmd %s' %squashfs_cmd)

			if subprocess.call(squashfs_cmd):
				bb.fatal('mksquashfs failed!')

			rmtree(packagedir+'/tmp')

			for repl in replaces:
				rdepends = d.getVar('RDEPENDS_'+repl, True).split(' ')
				rdepends.append(package)
				d.setVar('RDEPENDS_'+repl, ' '.join(rdepends))
				d.setVar('INSANE_SKIP_'+repl, 'dev-so')
				d.setVar('ALLOW_EMPTY_'+repl, '1')

			d.setVar('RDEPENDS_'+package, 'dreambox-squashfs-support')
			d.setVar('FILES_'+package, '/')
			d.setVar('pkg_preinst_'+package, 'if [ -z "$D" ]; then if mountpoint -q /media/squashfs-images/'+package+'; then umount /media/squashfs-images/'+package+' && losetup -d `losetup | grep '+package+' | cut -d: -f1` || touch /var/tmp/.umount_'+package+'_needed; else touch /var/tmp/.umount_'+package+'_needed; fi; fi')
			d.setVar('pkg_postinst_'+package, 'if [ -z "$D" ]; then if ! mountpoint -q /media/squashfs-images/'+package+'; then mount -t squashfs -o ro,loop /squashfs-images/'+package+' /media/squashfs-images/'+package+' || touch /var/tmp/.mount_'+package+'_needed; else touch /var/tmp/.mount_'+package+'_needed; fi; fi')
			d.setVar('pkg_postrm_'+package, 'if [ -z "$D" ]; then if mountpoint -q /media/squashfs-images/'+package+'; then umount /media/squashfs-images/'+package+' && losetup -d `losetup | grep '+package+' | cut -d: -f1` || touch /var/tmp/.umount_'+package+'_needed; else touch /var/tmp/.umount_'+package+'_needed; fi; fi')
			packages.append(package)

			idx += 1

		d.setVar('PACKAGES', ' '.join(packages))
}
