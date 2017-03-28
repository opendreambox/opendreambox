SRC_URI[cortexa15hf-neon-vfpv4.md5sum] = "a157bebe052a074e08cc3127f2930751"
SRC_URI[cortexa15hf-neon-vfpv4.sha256sum] = "514ee7c3bc23918f7dc4785d36dc29b3b4b43009c3f52a214c66c2b318bcf2f4"
SRC_URI[mips32el.md5sum] = "ec3e80c7d01cc71559e6ba92ed6282f4"
SRC_URI[mips32el.sha256sum] = "a5044ff825a76cf66fd15ccfdce42783b5c38ec43bad394f42c46da2f74e48ef"

require enigma2-bin-4.3.inc

SRC_URI += " \
	file://0001-NimManager.py-whitspace-cleanups.patch \
	file://0002-NimManager-re-add-deprecated-getNimType-function-to-.patch \
	file://0003-fixed-automatic-DVB-T-2-scan.patch \
	file://0004-use-inactive-instead-of-nothing-connected-and-active.patch \
	file://0005-fixed-tuner-defaults-for-single-C-T-tuners-and-multi.patch \
	file://0006-add-missing-blank-before-5V-text-when-5V-is-enabled.patch \
	file://0007-dont-allow-to-do-anything-in-manual-automatic-scan-w.patch \
	file://0008-use-inactive-event-for-disabled-DVB-S-2-tuner.patch \
	file://0009-ScanSetup-cosmetical-changes.patch \
"
