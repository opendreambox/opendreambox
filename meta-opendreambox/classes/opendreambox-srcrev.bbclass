def opendreambox_srcrev(srcrev, d):
    blacklist = ('mkbootblob', 'recovery', 'recovery-web')
    if d.getVar('BPN', True) in blacklist:
        return srcrev
    if oe.utils.inherits(d, 'opendreambox-autorev'):
        return '${AUTOREV}'
    return srcrev
