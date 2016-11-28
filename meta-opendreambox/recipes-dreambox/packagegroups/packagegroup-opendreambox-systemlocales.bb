SUMMARY = "OpenDreambox: Required system locales for the OpenDreambox Distribution"
SECTION = "opendreambox/base"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${OPENDREAMBOX_BASE}/LICENSE;md5=8f242b441da515e30c7b07f2cc6f4d5c"

inherit packagegroup

LOCALES = "en-gb de-de ar-ae pt-br ca-ad hr-hr cs-cz da-dk \
           nl-nl et-ee fi-fi fr-fr el-gr he-il hu-hu lt-lt \
           lv-lv is-is it-it nb-no fa-ir pl-pl pt-pt ru-ru \
           sr-rs sk-sk sl-si es-es sv-se tr-cy uk-ua fy-nl"

def systemlocales_deps(d):
    lcpkgs = d.getVar('GLIBC_SPLIT_LC_PACKAGES', True)
    if lcpkgs and int(lcpkgs):
        fmt = 'glibc-binary-localedata-%s-lc-time'
    else:
        fmt = 'locale-base-%s'

    return ' '.join([fmt % locale for locale in d.getVar('LOCALES', True).split()])

RRECOMMENDS_${PN} += "${@systemlocales_deps(d)}"
