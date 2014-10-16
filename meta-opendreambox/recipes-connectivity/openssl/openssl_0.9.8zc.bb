require recipes-connectivity/openssl/openssl.inc

LIC_FILES_CHKSUM = "file://LICENSE;md5=f9a8f968107345e0b75aa8c2ecaa7ec8"

SRC_URI += "file://debian/ca.patch \
            file://debian/config-hurd.patch;apply=no \
            file://debian/debian-targets.patch \
            file://debian/engines-path.patch \
            file://debian/kfreebsd-pipe.patch;apply=no \
            file://debian/make-targets.patch \
            file://debian/man-dir.patch \
            file://debian/man-section.patch \
            file://debian/no-rpath.patch \
            file://debian/no-symbolic.patch \
            file://debian/pic.patch \
            file://debian/pkg-config.patch \
            file://debian/rc4-amd64.patch \
            file://debian/rehash-crt.patch \
            file://debian/rehash_pod.patch \
            file://debian/shared-lib-ext.patch \
            file://debian/stddef.patch \
            file://debian/version-script.patch \
            file://debian/perl-path.diff"

SRC_URI += "file://configure-targets.patch \
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

BBCLASSEXTEND = "native nativesdk"

PARALLEL_MAKEINST = ""
