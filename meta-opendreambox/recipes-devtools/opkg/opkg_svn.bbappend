SRC_URI += "file://0001-Don-t-mark-Conflicts-as-Depends.patch \
            file://0002-Statically-link-libopkg-and-libbb.patch \
            file://0003-Makefile.am-remove-g-and-O-compiler-flags.patch \
            file://0004-pkg_depends-remove-unused-variables-to-fix-compiler-.patch \
            file://0005-pkg_hash_fetch_conflicts-fix-possible-segfaults.patch \
            file://0006-pkg_hash_fetch_conflicts-move-iteration-over-conflic.patch \
            file://0007-pkg_hash_fetch_conflicts-take-into-account-conflicts.patch \
            file://0008-opkg_remove-auto-delete-.pyo-files.patch \
            file://0009-002-no-shave.patch.patch \
            file://0010-use-AM_SILENT_RULES.patch \
            file://0011-fixed-broken-uname-gname-cache-this-significantly-sp.patch \
            file://0012-Keep-auto-installed-recommends-when-moved-from-depen.patch \
            file://0014-is_pkg_a_replaces-simplify-code.patch \
            file://0015-__pkg_hash_fetch_conflicts-ignore-virtual-conflicts.patch"

SRC_URI_append_class-target = " \
            file://0013-don-t-install-recommended-packages-automatically-but.patch"

FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"
