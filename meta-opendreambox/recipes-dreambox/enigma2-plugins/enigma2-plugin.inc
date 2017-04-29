inherit pythonnative

PACKAGES += "${PN}-meta"

RDEPENDS_${PN}_append = " enigma2 python-core"

FILES_${PN} += "${libdir}/enigma2/python"
FILES_${PN}-meta = "${datadir}/meta"

# Must be kept in sync with enigma2-plugins. Its version must
# increment whenever a plugin gets moved to its own recipe.
RBREAKS_${PN}-meta = "enigma2-plugins-meta (< 4.3.2)"
RREPLACES_${PN}-meta = "enigma2-plugins-meta (< 4.3.2)"

def package_add_metadata_deb(package, srcdir, d):
    fields = {}

    def set_field(key, value):
        if value:
            fields['X-DreamOS-%s' % key] = value

    def set_plugin_var(key):
        value = d.getVar('PLUGIN_%s_%s' % (key.upper(), package))
        if value is None:
            value = d.getVar('PLUGIN_%s' % key.upper())
        set_field(key, value)

    from glob import glob
    from os.path import join
    files = glob(join(srcdir, 'meta/plugin_*.xml'))
    if files:
        filename = sorted(files)[0]
        from xml.etree.ElementTree import parse
        try:
            tree = parse(filename)
        except Exception as e:
            bb.note("Failed to parse %s for package %s: %s" % (filename, package, repr(e)))
        else:
            root = tree.getroot()
            tags = [tag.get('type', '') for tag in root.findall('./prerequisites/tag')]
            set_field('Tags', ' '.join(tags))
            set_field('Author', root.findtext('./info/author'))
            set_field('Name', root.findtext('./info/name'))
            screenshot = root.find('./info/screenshot')
            if screenshot is not None:
                set_field('Screenshot', screenshot.get('src'))

    for field in ('Author', 'Name', 'Screenshot', 'Tags'):
        set_plugin_var(field)

    return '\n'.join(['%s: %s' % (key, value) for (key, value) in sorted(fields.items())])

PACKAGE_ADD_METADATA_DEB_${PN} = "${@package_add_metadata_deb(d.getVar('PN'), d.getVar('S'), d)}"
