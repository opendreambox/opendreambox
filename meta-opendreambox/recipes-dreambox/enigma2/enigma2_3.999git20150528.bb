PR = "${INC_PR}.1"

SRC_URI[mips32el.md5sum] = "b85a83340986e6f4f153afe5ef273d0f"
SRC_URI[mips32el.sha256sum] = "90f044b77aefc378bcfbf10697495bcad78ada3032ec7184a0e1c075cf56a5a1"
SRC_URI[mips32el-nf.md5sum] = "d1d12da0ac8dd98ce82a480e32547b4a"
SRC_URI[mips32el-nf.sha256sum] = "082a78f02115a7510ef6ee9fd695e54dc735029713080181703a733af9c1d28c"

SRC_URI += " file://0001-CommonInterfaceAssignment-dont-crash-when-no-accessi.patch"

require enigma2-bin-4.0.inc
