SRC_URI[mips32el.md5sum] = "0ae92d821ff149981846f29cacd017ac"
SRC_URI[mips32el.sha256sum] = "9b3d16c3296cd82850aff4b31aefc0be12ae69f5228018ca728a739da49735cb"
SRC_URI[cortexa15hf-neon-vfpv4.md5sum] = "5bf715937606b39de72c1920a0b18ebe"
SRC_URI[cortexa15hf-neon-vfpv4.sha256sum] = "932a1dc99497ada737adf1fc6a1b0b83e4fa4c6b29e06f7b51b604364fdfe0eb"

require enigma2-bin-4.3.inc

SRC_URI += " file://0001-ScanSetup-show-SR-option-again.patch"

