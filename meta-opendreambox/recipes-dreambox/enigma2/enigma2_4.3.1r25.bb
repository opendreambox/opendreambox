SRC_URI[mips32el.md5sum] = "a2f16d9b5b5f403b2ed26d36ae6a022a"
SRC_URI[mips32el.sha256sum] = "2305602d424048718104ce89b69100be9f15cbbb086b1aeb923b657fc9f48a9e"
SRC_URI[cortexa15hf-neon-vfpv4.md5sum] = "36f58d0ea805d34474f818895799ec7d"
SRC_URI[cortexa15hf-neon-vfpv4.sha256sum] = "dc0219d6e746acf3ed21fc98753c3774adf04fa523811349f2a8d31b07a90292"

require enigma2-bin-4.3.inc

SRC_URI += " \
	file://0001-Default-FHD-put-back-some-values-to-default-fhd-for-.patch \
	file://0004-plugins-update-keymaps-for-better-keyboard-usability.patch \
	file://0006-ScanSetup-fixed-broken-blinscan-with-Si216x2-after-r.patch \
	file://0003-keymap-improve-keyboard-support-by-forum-member-pcli.patch \
	file://0005-Converter-ServiceInfo-re-add-evVideoSizeChanged-to-F.patch \
"


