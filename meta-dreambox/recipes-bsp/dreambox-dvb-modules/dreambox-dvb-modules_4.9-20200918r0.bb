SRC_URI[dreamone.md5sum] = "7d3a00bbc6c193e3b3bc82b7728c4678"
SRC_URI[dreamone.sha256sum] = "40e256d0d1c22613f4790d1ad75388cbaebc07543460e43f913eaee0ee430c50"
SRC_URI[dreamtwo.md5sum] = "ba270aea818c77ba2d4a2c68c47d4ea0"
SRC_URI[dreamtwo.sha256sum] = "f4c0af67f600d9aaf01f7c382635de552521f9e8b515f262ba79a76fdf9f9d87"

require dreambox-dvb-modules.inc

RREPLACES_${PN} += "dreamframeinject"
RPROVIDES_${PN} += "dreamframeinject"
RCONFLICTS_${PN} += "dreamframeinject"

COMPATIBLE_MACHINE = "^(dreamone|dreamtwo)$"
