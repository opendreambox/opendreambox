require dreamliveserver.inc

SRC_URI[cortexa15hf-neon-vfpv4.md5sum] = "e4e3bbc79be915ba906ac884f71a90cb"
SRC_URI[cortexa15hf-neon-vfpv4.sha256sum] = "9328543c84367f142d6d1c3aada3946ec8e8b606dcb28f27798e3c2d032fa0e5"
SRC_URI[mips32el.md5sum] = "a27b65ed0f216fc5af76a56b3aa321ff"
SRC_URI[mips32el.sha256sum] = "91f529671d3eabbd0c2e8c692ec7f189251e5f46e0ce604fb8a425a3ec014ba5"

RREPLACES_${PN} += "dreamrtspserver gst-plugin-dreamsource"
RCONFLICTS_${PN} += "dreamrtspserver gst-plugin-dreamsource"
RPROVIDES_${PN} += "dreamrtspserver gst-plugin-dreamsource"

inherit opendreambox-precompiled-binary
