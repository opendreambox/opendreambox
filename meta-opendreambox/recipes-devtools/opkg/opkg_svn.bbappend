PR .= "-dream7"

PATCHES = "file://0009-don-t-add-recommends-pkgs-to-depended-upon-by.patch \
           file://0011-opkg-allow-package-move-from-depends-to-recommends.patch \
           file://0012-opkg-dont-handle-recommends-as-depends.patch"

PATCHES_virtclass-native = ""

SRC_URI += "file://0001-Fixed-opkg-losing-auto_installed-flag-on-upgrading.patch \
            file://0002-Don-t-mark-Conflicts-as-Depends.patch \
            file://0003-Statically-link-libopkg-and-libbb.patch \
            file://0004-Makefile.am-remove-g-and-O-compiler-flags.patch \
            file://0005-pkg_depends-remove-unused-variables-to-fix-compiler-.patch \
            file://0006-pkg_hash_fetch_conflicts-fix-possible-segfaults.patch \
            file://0007-pkg_hash_fetch_conflicts-move-iteration-over-conflic.patch \
            file://0008-pkg_hash_fetch_conflicts-take-into-account-conflicts.patch \
            file://0010-opkg_remove-auto-delete-.pyo-files.patch \
            ${PATCHES} \
            file://unarchive-fixed-uname-gname-cache.patch"

FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"
