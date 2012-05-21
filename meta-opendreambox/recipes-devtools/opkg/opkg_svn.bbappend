PR .= "-dream4"

SRC_URI += "file://0001-Fixed-opkg-losing-auto_installed-flag-on-upgrading.patch \
            file://0002-Don-t-mark-Conflicts-as-Depends.patch \
            file://0003-Statically-link-libopkg-and-libbb.patch \
            file://0004-Makefile.am-remove-g-and-O-compiler-flags.patch \
            file://0005-pkg_depends-remove-unused-variables-to-fix-compiler-.patch \
            file://0006-pkg_hash_fetch_conflicts-fix-possible-segfaults.patch \
            file://0007-pkg_hash_fetch_conflicts-move-iteration-over-conflic.patch \
            file://0008-pkg_hash_fetch_conflicts-take-into-account-conflicts.patch \
            file://0009-Revert-Add-Recommended-packages-to-the-depended_upon.patch \
            file://0010-opkg_remove-auto-delete-.pyo-files.patch"

FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"
