require dreamliveserver.inc

SRC_URI[aarch64.md5sum] = "ad701300d27b89fbe97dfdd09736be75"
SRC_URI[aarch64.sha256sum] = "0cb72517df0e4bc5836f77a765b361c5f851099cd28643cf4a3c2084397fd8b4"

RREPLACES_${PN} += "dreamrtspserver gst-plugin-dreamsource"
RCONFLICTS_${PN} += "dreamrtspserver gst-plugin-dreamsource"
RPROVIDES_${PN} += "dreamrtspserver gst-plugin-dreamsource"

inherit opendreambox-precompiled-binary
