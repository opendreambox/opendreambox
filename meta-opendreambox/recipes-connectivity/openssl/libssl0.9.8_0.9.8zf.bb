require libssl.inc

BINV = "0.9.8"

SRC_URI += "file://debian/debian-targets.patch \
            file://debian/no-rpath.patch \
            file://debian/no-symbolic.patch \
            file://debian/shared-lib-ext.patch \
            file://debian/stddef.patch \
            file://debian/version-script.patch \
            file://debian/perl-path.diff \
            file://shared-libs.patch \
            file://parallel-make-fix.patch \
            file://find.pl"

SRC_URI[md5sum] = "c69a4a679233f7df189e1ad6659511ec"
SRC_URI[sha256sum] = "d5245a29128984192acc5b1fc01e37429b7a01c53cadcb2645e546718b300edb"

EXTRA_OECONF += "no-idea no-mdc2 no-rc5"

do_configure_prepend() {
        cp ${WORKDIR}/find.pl ${S}/util/find.pl
        # delete dangling links
        find -L ${S}/include/openssl -type l -delete
}

PARALLEL_MAKEINST = ""
