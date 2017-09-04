SRC_URI[cortexa15hf-neon-vfpv4.md5sum] = "03f83465aba78c1816103e8fdb0b1d6e"
SRC_URI[cortexa15hf-neon-vfpv4.sha256sum] = "663a722edf680da263714e79d944692259076d8d5af080dafe1d4af124bd1572"
SRC_URI[mips32el.md5sum] = "993f390187d529e51a701eacb9559955"
SRC_URI[mips32el.sha256sum] = "bb691bff8bce453e903fb218c8f92c0b49a3e84614524e2f93fba9f1b32bbccd"

require enigma2-bin-4.3.inc

SRC_URI += " file://0001-InfoBarServiceErrorSupport-close-statinfo-onClose.patch"

