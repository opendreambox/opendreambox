SUMMARY = "decoding library for DTS Coherent Acoustics streams"
SECTION = "libs/multimedia"
LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://COPYING;md5=751419260aa954499f7abaabaa882bbe"
SRCREV = "4f6b5d6e6fb35994c342de95bf05e20117da549b"

SRC_URI = "git://anonscm.debian.org/collab-maint/${BPN}.git;protocol=git"

S = "${WORKDIR}/git"

inherit autotools lib_package pkgconfig

libdca_do_patch() {
        cd ${S}
        quilt pop -a || true
        if [ -d ${S}/.pc-debian ]; then
                rm -rf ${S}/.pc
                mv ${S}/.pc-debian ${S}/.pc
                QUILT_PATCHES=${S}/debian/patches quilt pop -a
                rm -rf ${S}/.pc ${S}/debian
        fi
        QUILT_PATCHES=${S}/debian/patches quilt push -a
        mv ${S}/.pc ${S}/.pc-debian

        # single precision is enough and speeds up libdca by about 10-15%
        sed -i -e 's/double/sample_t/g' ${S}/libdca/*.c ${S}/libdca/*.h
}

do_unpack[cleandirs] += "${S}"

# We invoke base do_patch at end, to incorporate any local patch
python do_patch() {
    bb.build.exec_func('libdca_do_patch', d)
    bb.build.exec_func('patch_do_patch', d)
}
