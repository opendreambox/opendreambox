python qt5_split_packages() {
    def libhook(file, pkg, pattern, format, basename):
        pn = d.getVar('PN', True)
        d.appendVar('RDEPENDS_%s' % pn, ' %s' % pkg)

    def pluginhook(file, pkg, pattern, format, basename):
        pn = d.getVar('PN', True)
        d.appendVar('RDEPENDS_%s-plugins' % pn, ' %s' % pkg)

    pn = d.getVar('PN', True)
    libdir = d.getVar('libdir', True)
    do_split_packages(d, libdir, '^lib(.*)\.so\..*$', 'lib%s', pn + ' %s library', hook=libhook, extra_depends='', prepend=True, allow_links=True)

    pluginsdir = d.getVar('OE_QMAKE_PATH_PLUGINS', True)
    for plugintype in ('bearer', 'generic', 'platforms', 'imageformats', 'platforminputcontexts', 'sqldrivers'):
        subdir = '%s/%s' % (pluginsdir, plugintype)
        do_split_packages(d, subdir, '^lib(.*)\.so$', pn + '-plugin-' + plugintype + '-%s', pn + ' %s plugin', hook=pluginhook, extra_depends='', prepend=True)
}

PACKAGESPLITFUNCS_prepend = "qt5_split_packages "
PACKAGES_DYNAMIC += "^${PN}-plugin-.*"

ALLOW_EMPTY_${PN} = "1"
ALLOW_EMPTY_${PN}-plugins = "1"
