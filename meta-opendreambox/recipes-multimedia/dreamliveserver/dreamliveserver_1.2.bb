require dreamliveserver.inc

SRC_URI[mips32el.md5sum] = "eedae89e358755950db495ff81600533"
SRC_URI[mips32el.sha256sum] = "11de65a5370f379b3d23358d0d5816d27ba61e0945e05b5d385ebfbb731d3f14"
SRC_URI[cortexa15hf-neon-vfpv4.md5sum] = "92874f71864136592618abc40d58195b"
SRC_URI[cortexa15hf-neon-vfpv4.sha256sum] = "957f04435f86b6693ca54effe3267ec37fb0d027f59e7f6409916149cd1124c3"

RREPLACES_${PN} += "dreamrtspserver gst-plugin-dreamsource"
RCONFLICTS_${PN} += "dreamrtspserver gst-plugin-dreamsource"
RPROVIDES_${PN} += "dreamrtspserver gst-plugin-dreamsource"

inherit opendreambox-precompiled-binary
