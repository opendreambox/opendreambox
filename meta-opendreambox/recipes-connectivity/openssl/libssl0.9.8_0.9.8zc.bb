require libssl.inc

BINV = "0.9.8"

PR = "r1"

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

SRC_URI[md5sum] = "1b239eea3a60d67863e7b66700e47a16"
SRC_URI[sha256sum] = "461cc694f29e72f59c22e7ea61bf44671a5fc2f8b3fc2eeac89714b7be915881"

EXTRA_OECONF += "no-idea no-mdc2 no-rc5"

do_configure_prepend() {
        cp ${WORKDIR}/find.pl ${S}/util/find.pl
        # delete dangling links
        find -L ${S}/include/openssl -type l -delete
}

PARALLEL_MAKEINST = ""
