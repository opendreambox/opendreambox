PR .= "-dream3"

SRC_URI += "file://optional-extfs-dir.patch \
            file://optional-hints.patch \
            file://optional-sfs-ini.patch \
            file://optional-syntax-file.patch"

PACKAGES += "${PN}-full"

RDEPENDS_${PN} = ""
RDEPENDS_${PN}-full = "ncurses-terminfo"

RSUGGESTS_${PN} = "${PN}-full"

FILES_${PN} = " \
        ${bindir}/* \
        ${sysconfdir}/mc/filehighlight.ini \
        ${sysconfdir}/mc/*.ext \
        ${sysconfdir}/mc/*.keymap \
        ${sysconfdir}/mc/*.menu \
        ${datadir}/${BPN}/mc.* \
        ${datadir}/${BPN}/skins/default.ini \
"
FILES_${PN}-full = "${libexecdir}/* ${sysconfdir} ${datadir}/${BPN}"

FILESEXTRAPATHS_prepend := "${THISDIR}/${P}:"
