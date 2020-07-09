PACKAGE_ARCH = "${MACHINE_ARCH}"

pkg_postinst_${PN}() {
[ -n "$D" ] || flash-fsbl
}
