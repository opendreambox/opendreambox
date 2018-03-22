require dreamliveserver.inc

SRC_URI[cortexa15hf-neon-vfpv4.md5sum] = "ebc1dbba32ba324c9fe4400799c8fa24"
SRC_URI[cortexa15hf-neon-vfpv4.sha256sum] = "0b4f145f00b74f00230c731a7ebc5e40c2f1179c19f975a7aa7d093d019efc6c"
SRC_URI[mips32el.md5sum] = "6416a44a6b4886b61525d7bca8764970"
SRC_URI[mips32el.sha256sum] = "2c9bebfc3e66ff4c304e3a633720c0da7bb1ff0e423e4886f5ef6aba09a5f725"

RREPLACES_${PN} += "dreamrtspserver gst-plugin-dreamsource"
RCONFLICTS_${PN} += "dreamrtspserver gst-plugin-dreamsource"
RPROVIDES_${PN} += "dreamrtspserver gst-plugin-dreamsource"

inherit opendreambox-precompiled-binary
