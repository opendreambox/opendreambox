require recipes-connectivity/openssl/openssl.inc

PR = "${INC_PR}.0"

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
            file://openssl-fix-doc.patch \
            file://find.pl"

SRC_URI[md5sum] = "2f989915f8fea49aa1bc37aa58500cce"
SRC_URI[sha256sum] = "cdcb98d0fbc026ca798b17919334310271d3a593554ffd6a59659b9222fd4e48"

EXTRA_OECONF += "no-idea no-mdc2 no-rc5"

do_configure_prepend() {
        cp ${WORKDIR}/find.pl ${S}/util/find.pl
        # delete dangling links
        find -L ${S}/include/openssl -type l -delete
}

BBCLASSEXTEND = "native nativesdk"

PARALLEL_MAKEINST = ""
