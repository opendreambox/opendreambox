#
# This class helps creating transitional packages. When a package
# was renamed from A to B, add TRANSITION_B = "A" to your recipe.
#
# https://wiki.debian.org/PackageTransition#Package_Transition
# https://wiki.debian.org/RenamingPackages#Transition_package_method
#

python __anonymous() {
    if bb.data.inherits_class('native', d) or \
       bb.data.inherits_class('cross', d) or \
       bb.data.inherits_class('crosssdk', d) or \
       bb.data.inherits_class('cross-canadian', d):
        return

    for p in (d.getVar('PACKAGES', True) or '').split():
        for t in (d.getVar('TRANSITION_' + p, True) or '').split():
            d.appendVar('PACKAGES', ' ' + t)
            d.setVar('SUMMARY_' + t, 'Transitional package for ' + p)
            d.setVar('DESCRIPTION_' + t, 'This is a transitional package for %s. It can safely be removed.' % p)
            d.setVar('SECTION_' + t, 'oldlibs')
            d.setVar('RDEPENDS_' + t, p)
            d.setVar('FILES_' + t, '')
            d.setVar('ALLOW_EMPTY_' + t, '1')

            d.appendVar('RBREAKS_' + p, ' ' + t)
            d.appendVar('RREPLACES_' + p, ' ' + t)
            d.appendVar('RPROVIDES_' + p, ' ' + t)
}

def pkgtransvars(d):
    return ' '.join(['TRANSITION_' + p for p in (d.getVar('PACKAGES', True) or '').split()])

populate_packages[vardeps] += "${@pkgtransvars(d)}"
