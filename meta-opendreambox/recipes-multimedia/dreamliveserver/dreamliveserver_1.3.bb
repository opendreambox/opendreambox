require dreamliveserver.inc

SRC_URI[mips32el.md5sum] = "33d5a5626f690193004abf487123b5e6"
SRC_URI[mips32el.sha256sum] = "37b6dbe47bfce4424aa1e37f892e3586f97cb934988d527b1d9812cafad716eb"
SRC_URI[cortexa15hf-neon-vfpv4.md5sum] = "8860d5e786c4ac7f61c872de044239b1"
SRC_URI[cortexa15hf-neon-vfpv4.sha256sum] = "3ea0d4f23786f54cfb6a9e6a0123b6cac904f2d57a830e2cb037719da892402b"

RREPLACES_${PN} += "dreamrtspserver gst-plugin-dreamsource"
RCONFLICTS_${PN} += "dreamrtspserver gst-plugin-dreamsource"
RPROVIDES_${PN} += "dreamrtspserver gst-plugin-dreamsource"

inherit opendreambox-precompiled-binary
