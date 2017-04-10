SRC_URI[cortexa15hf-neon-vfpv4.md5sum] = "95df3b2681e8236822d9ca0a988f71c1"
SRC_URI[cortexa15hf-neon-vfpv4.sha256sum] = "378e447027dfdff2f1877177d2e1f8541d3857a2b36a99038baecd26b82c8802"
SRC_URI[mips32el.md5sum] = "62cbb821dd00032311fddc29d8e4295c"
SRC_URI[mips32el.sha256sum] = "d4bfdf300c59e4bd2a98b824af80438ca1e633a603bdfcb395e28749a3863e76"

require enigma2-bin-4.3.inc

SRC_URI += " file://0001-added-missing-header-.-needed-for-cpp-plugin-compile.patch"
