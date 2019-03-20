LICENSE = "CLOSED"

inherit android-bootimg

INITRAMFS_IMAGE = "dreambox-rescue-image"
INITRAMFS_OFFSET = "0x4000000"
DTB_OFFSET = "0x1000000"

def kernel_console(d):
    console = ','.join(reversed(next(iter((d.getVar('SERIAL_CONSOLES') or '').split()), 'null').split(';')))
    return 'console=%s' % console

CMDLINE = "${@kernel_console(d)} root=/dev/mmcblk0p7 rootwait rootfstype=ext4 no_console_suspend"

COMPATIBLE_MACHINE = "^(dreamone)$"
