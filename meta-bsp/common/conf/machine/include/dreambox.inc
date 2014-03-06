# dreambox.inc

GLIBC_EXTRA_OECONF = "--with-tls --with-__thread"

MACHINE_ESSENTIAL_EXTRA_RDEPENDS += "packagegroup-opendreambox-essential"
MACHINE_FEATURES += "alsa kernel26 wifi"

PREFERRED_PROVIDER_virtual/kernel = "linux-dreambox"

KERNEL_IMAGETYPE = "vmlinux"
KERNEL_OUTPUT = "${KERNEL_IMAGETYPE}"
KERNEL_CONSOLE = "${@base_contains('DREAMBOX_FEATURES', 'usbconsole', 'ttyS0,115200', 'null', d)}"

DREAMBOX_BUILDIMAGE = "buildimage --arch ${MACHINE} ${EXTRA_BUILDCMD} \
	--erase-block-size ${DREAMBOX_ERASE_BLOCK_SIZE} \
	--sector-size ${DREAMBOX_SECTOR_SIZE}"
