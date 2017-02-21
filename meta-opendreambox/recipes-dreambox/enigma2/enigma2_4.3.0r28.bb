SRC_URI[cortexa15hf-neon-vfpv4.md5sum] = "fc94422e288a0807e08173f98cdc26bc"
SRC_URI[cortexa15hf-neon-vfpv4.sha256sum] = "364b0f1dcb278b206e03d055175d96035d0863997f36d2604344b5382d96eb53"
SRC_URI[mips32el.md5sum] = "68a24e0567eb827ae22e46f88b9cf689"
SRC_URI[mips32el.sha256sum] = "26208552097c45da5268543ad384c1c0791f3020f15038c6c78ea5f8b856900c"

require enigma2-bin-4.3.inc

SRC_URI += " \
	file://0001-Menu-fix-Menu-icon-loading-failing-on-non-default-sk.patch \
	file://0002-skins-fix-issues-caused-by-svg-transition.patch \
"
