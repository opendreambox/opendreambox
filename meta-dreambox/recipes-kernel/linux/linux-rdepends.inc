DEPENDS += "linux-firmware zd1211-firmware"

RDEPENDS_kernel-module-carl9170 ?= "linux-firmware-carl9170"
RDEPENDS_kernel-module-r8712u ?= "linux-firmware-rtl8192su"
RDEPENDS_kernel-module-rt2800usb ?= "linux-firmware-rt2800usb"
RDEPENDS_kernel-module-rt73usb ?= "linux-firmware-rt73usb"
RDEPENDS_kernel-module-zd1211rw ?= "zd1211-firmware"
RRECOMMENDS_kernel-module-cifs ?= "kernel-module-arc4 kernel-module-ecb kernel-module-hmac kernel-module-md4"
RRECOMMENDS_kernel-module-mac80211 ?= "kernel-module-aes-generic kernel-module-arc4"
