DEPENDS_append = " mkbootimg-native"

do_fetch[noexec] = "1"
do_unpack[noexec] = "1"
do_patch[noexec] = "1"
do_configure[noexec] = "1"
do_compile[noexec] = "1"
do_install[noexec] = "1"
do_package[noexec] = "1"
do_packagedata[noexec] = "1"
do_package_write_ipk[noexec] = "1"
do_package_write_deb[noexec] = "1"
do_package_write_rpm[noexec] = "1"

inherit deploy kernel-artifact-names

INITRAMFS_IMAGE ?= ""

BOOTIMG_NAME ?= "${@['${INITRAMFS_IMAGE}', '${PN}'][d.getVar('INITRAMFS_IMAGE') == '']}"
BOOTIMG_BASE_NAME ?= "${MACHINE}"
BOOTIMG_SYMLINK_NAME ?= "${MACHINE}"

KERNEL_PATH ?= "${DEPLOY_DIR_IMAGE}/${KERNEL_IMAGETYPE}"
KERNEL_OFFSET ?= "${UBOOT_ENTRYPOINT}"

INITRAMFS_PATH ?= "${@['${DEPLOY_DIR_IMAGE}/${INITRAMFS_IMAGE}-${MACHINE}.cpio.gz', ''][d.getVar('INITRAMFS_IMAGE') == '']}"
INITRAMFS_OFFSET ?= ""

DTB_PATH ?= "${DEPLOY_DIR_IMAGE}/${KERNEL_DTB_SYMLINK_NAME}.dtb"
DTB_OFFSET ?= ""

CMDLINE ?= ""

do_deploy[depends] = "virtual/kernel:do_deploy ${@['${INITRAMFS_IMAGE}:do_image_complete', ''][d.getVar('INITRAMFS_IMAGE') == '']}"
do_deploy[vardepsexclude] = "DATETIME"
do_deploy() {
    mkbootimg="mkbootimg --base 0 --kernel ${KERNEL_PATH} --kernel_offset ${KERNEL_OFFSET}"
    if [ -n "${INITRAMFS_PATH}" ]; then
        mkbootimg="$mkbootimg --ramdisk ${INITRAMFS_PATH}"
        [ -z "${INITRAMFS_OFFSET}" ] || mkbootimg="$mkbootimg --ramdisk_offset ${INITRAMFS_OFFSET}"
    fi
    if [ -n "${DTB_PATH}" -a -f "${DTB_PATH}" ]; then
        mkbootimg="$mkbootimg --second ${DTB_PATH}"
        [ -z "${DTB_OFFSET}" ] || mkbootimg="$mkbootimg --second_offset ${DTB_OFFSET}"
    fi
    $mkbootimg --board "${MACHINE}" --cmdline "${CMDLINE}" -o "${DEPLOYDIR}/${BOOTIMG_NAME}-${BOOTIMG_BASE_NAME}-${DATETIME}.bootimg"
    ln -fns "${BOOTIMG_NAME}-${BOOTIMG_BASE_NAME}-${DATETIME}.bootimg" "${DEPLOYDIR}/${BOOTIMG_NAME}-${BOOTIMG_SYMLINK_NAME}.bootimg"
}

addtask deploy before do_build after do_compile
