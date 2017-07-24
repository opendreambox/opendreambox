SRC_URI[mips32el.md5sum] = "0c652f9310287af61fcd683c0497c351"
SRC_URI[mips32el.sha256sum] = "56f3dd5ec7ca22b6b797df2d5456678289e9e91cd6e98e2452ef76320f199845"
SRC_URI[cortexa15hf-neon-vfpv4.md5sum] = "4ed4eace2cbaffde8af086b7d3c8cf03"
SRC_URI[cortexa15hf-neon-vfpv4.sha256sum] = "2ed80d7f3f131fb71eb2dc066283a975ea503d5f471aa13cedac139e9d53947a"

require enigma2-bin-4.3.inc

SRC_URI += " file://0001-startwizard-add-missing-braket.patch"
