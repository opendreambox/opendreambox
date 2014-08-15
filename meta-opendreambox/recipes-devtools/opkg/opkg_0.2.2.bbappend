SRC_URI += " \
    file://0001-Don-t-mark-Conflicts-as-Depends.patch \
    file://0002-Makefile.am-remove-g-and-O-compiler-flags.patch \
    file://0003-pkg_depends-remove-unused-variables-to-fix-compiler-.patch \
    file://0004-pkg_hash_fetch_conflicts-fix-possible-segfaults.patch \
    file://0005-pkg_hash_fetch_conflicts-move-iteration-over-conflic.patch \
    file://0006-pkg_hash_fetch_conflicts-take-into-account-conflicts.patch \
    file://0007-opkg_remove-auto-delete-.pyo-files.patch \
    file://0008-002-no-shave.patch.patch \
    file://0009-use-AM_SILENT_RULES.patch \
    file://0010-fixed-broken-uname-gname-cache-this-significantly-sp.patch \
    file://0011-Keep-auto-installed-recommends-when-moved-from-depen.patch \
    file://0012-is_pkg_a_replaces-simplify-code.patch \
    file://0013-__pkg_hash_fetch_conflicts-ignore-virtual-conflicts.patch \
    file://0014-opkg-key-don-t-install-unless-compiled-with-GPG-supp.patch \
    file://0015-build-No-need-to-add-libbb.la-twice-libopkg-already-.patch \
    file://0016-build-Allow-to-link-libopkg-statically-into-opkg-cl.patch \
    file://0017-pkg_conflicts-Consider-version-constraints.patch \
    file://0018-libopkg-opkg_install.c-Fix-for-virtual-packages.patch \
    file://0019-opkg_upgrade_cmd-Only-upgrade-installed-packages.patch \
"

FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

EXTRA_OECONF += "--with-static-opkg-cl"
