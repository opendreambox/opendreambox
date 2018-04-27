require dreamliveserver.inc

SRC_URI[cortexa15hf-neon-vfpv4.md5sum] = "9d851c4f8e10a04b098480dc7c37f651"
SRC_URI[cortexa15hf-neon-vfpv4.sha256sum] = "edc3d037ec16ff34146673e03e839d79ca1e1264aa19e72a60276b887175ad3c"
SRC_URI[mips32el.md5sum] = "dc84ee10411c938596a708643a16dc97"
SRC_URI[mips32el.sha256sum] = "f887e0a1edcdd91df5b8ea4ebcc6c570a23fbccf6df397a42931fa696090564e"

RREPLACES_${PN} += "dreamrtspserver gst-plugin-dreamsource"
RCONFLICTS_${PN} += "dreamrtspserver gst-plugin-dreamsource"
RPROVIDES_${PN} += "dreamrtspserver gst-plugin-dreamsource"

inherit opendreambox-precompiled-binary
