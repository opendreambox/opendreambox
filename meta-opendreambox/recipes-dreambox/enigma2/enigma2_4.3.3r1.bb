SRC_URI[cortexa15hf-neon-vfpv4.md5sum] = "255f076cfd0448149beaa9dad3e4da3e"
SRC_URI[cortexa15hf-neon-vfpv4.sha256sum] = "2820aa0e77b7a7b012fb31b6ab699edfe707ed778d3d3d6bf04ba50850c4b16c"
SRC_URI[mips32el.md5sum] = "1fd9ab1efbdda3b7bb34eabc10a34ef2"
SRC_URI[mips32el.sha256sum] = "6333a8d992f5269f94f962806ef8a7df90e6b5fcae74bb91f05a77e322585a2a"

SRC_URI += " \
    file://0001-NetworkManager-fix-crash.patch \
"

require enigma2-bin-4.3.inc
