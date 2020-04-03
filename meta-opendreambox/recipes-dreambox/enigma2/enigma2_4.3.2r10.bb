SRC_URI[cortexa15hf-neon-vfpv4.md5sum] = "4d337c9b907011844779983e356631c2"
SRC_URI[cortexa15hf-neon-vfpv4.sha256sum] = "a383f586bdbc05658990e44ab85145f09aff8285f59ca483acf3e6d87756731b"
SRC_URI[mips32el.md5sum] = "dc986c61a29673cecd25fd358020aeba"
SRC_URI[mips32el.sha256sum] = "83f560ccf18920c453aac9c67c8f46414eb93aad34b577d0e157f97a7f454a4c"

require enigma2-bin-4.3.inc

SRC_URI += " \
	file://0001-TemplatedListFonts-actually-add-the-new-Keyboard-fon.patch \
	file://0001-Converter.TemplatedMultiContent-add-missing-SCALE_-i.patch \
"
