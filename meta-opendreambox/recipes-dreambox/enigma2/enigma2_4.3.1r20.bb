SRC_URI[cortexa15hf-neon-vfpv4.md5sum] = "3a5a4848fa987fdd6ef6ea1179681751"
SRC_URI[cortexa15hf-neon-vfpv4.sha256sum] = "1fed9d9acc08bb8621be5bd545d13b1de30edd1953edbef497a88f3e39f6a4d8"
SRC_URI[mips32el.md5sum] = "ae19f9d4bccab0bb521e01d37ad4cbb1"
SRC_URI[mips32el.sha256sum] = "f4331422d232ba617b3122c13cd0deeb6bd5d26a6b67a7ae6a40c66e45298d8f"

require enigma2-bin-4.3.inc

SRC_URI += " \
	file://0001-NimManager-dont-crash-on-empty-tuner-slot-s.patch \
	file://0002-MediaCenter-remove-from-extensions-menus-it-s-in-the.patch \
	file://0003-update-default-tv-favourites-bouquet.patch \
"
