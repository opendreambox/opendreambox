PR = "${INC_PR}.9"

PATCHREV = "ac6cc9511a5f70eaa584c63fc5c3de33cae1d0e7"

SRC_URI = " \
        ${KERNELORG_MIRROR}/linux/kernel/v2.6/linux-${PV}.tar.bz2;name=kernel \
        http://sources.dreamboxupdate.com/download/kernel-patches/${P}-${PATCHREV}.patch.bz2;name=patch \
        file://defconfig \
        file://stblinux-2.6.18-extra-version-7.4.patch \
        file://stblinux-2.6.18-brcmnand-oob-raw-write-fix.patch \
        file://linux-2.6.18-fix-mips-crosscompile.patch \
        file://linux-2.6.18-fix-proc-cputype.patch \
        file://dvb-api-2.6.18-5.3.patch \
        file://linux-2.6.18-dvb-core-headers-20100904.patch \
        file://linux-2.6.18-dvb-frontends-headers-20100904.patch \
        file://stblinux-2.6.18-fixed-brcmnand-buffer-overflow.patch \
        file://stblinux-2.6.18-brcmnand-fixed-dm7020hd-oob-write-op.patch \
        file://stblinux-2.6.18-libata-revert-no-more-needed-change.patch \
        file://stblinux-2.6.18-libata-hdd-spinup-workaround.patch \
        file://kbuild-fix-make-incompatibility.patch \
        file://0001-MIPS-Fix-possible-hang-in-LL-SC-futex-loops.patch \
        file://0001-Add-support-for-FTDI-FT4232H-based-devices.patch \
        file://0001-proc-mounts_poll-make-consistent-to-mdstat_poll.patch \
"
SRC_URI[kernel.md5sum] = "296a6d150d260144639c3664d127d174"
SRC_URI[kernel.sha256sum] = "c95280ff6c5d2a17788f7cc582d23ae8a9a7ba3f202ec6e4238eaadfce7c163d"
SRC_URI[patch.md5sum] = "d8938aa5b1a5c6928a1fad3c699bd98e"
SRC_URI[patch.sha256sum] = "faca8966d65932619bf69d034ed892ac9bb5f5c9b57ba50ba8dbe471894105ac"

S = "${WORKDIR}/linux-${PV}"

require linux-dreambox.inc

do_install_append() {
        cp include/asm/asm-offsets.h $kerneldir/include/asm/asm-offsets.h
        cp scripts/basic/fixdep $kerneldir/scripts/basic/fixdep
        cp scripts/mod/modpost $kerneldir/scripts/mod/modpost
}
