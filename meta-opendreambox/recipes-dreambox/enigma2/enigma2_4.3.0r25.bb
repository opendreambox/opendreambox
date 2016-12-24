SRC_URI[cortexa15hf-neon-vfpv4.md5sum] = "25d426d9aa5ca71781318c3ed9d366be"
SRC_URI[cortexa15hf-neon-vfpv4.sha256sum] = "5bea252b1f6b8303f517f2a20136842783db2b1de8b5b23cddb6e18cdca0a162"

SRC_URI[mips32el.md5sum] = "78eb7dd4cbf393a10d2642f2a039c2d8"
SRC_URI[mips32el.sha256sum] = "028052d2e1e8cca483fa1e346e2e9c58c1282ccbc0665754d915f8bebfb7198a"

SRC_URI += " file://0001-add-HACK-for-unicable-config-migration-to-new-format.patch"

require enigma2-bin-4.3.inc
