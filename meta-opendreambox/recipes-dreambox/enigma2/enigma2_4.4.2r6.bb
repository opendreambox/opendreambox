SRC_URI[aarch64.md5sum] = "4aabf52c459acf7eca30c0471a7db57f"
SRC_URI[aarch64.sha256sum] = "8e50ed5c0e8ee820b5f05020d5dde6a26b60bd901ef4a3ae64a3f8c3c56cbf1a"

require enigma2-bin-4.3.inc

SRC_URI += " file://0001-Converter.TemplatedMultiContent-add-missing-SCALE_-i.patch"
