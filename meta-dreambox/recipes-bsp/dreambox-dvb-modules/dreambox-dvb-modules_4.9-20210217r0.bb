SRC_URI[dreamone.md5sum] = "77f91d3aa912405b45db5bb744b08277"
SRC_URI[dreamone.sha256sum] = "a0fbd1958f1149e367f55a9d357a41ace6c514844e4b0b9758c3e9f65351e66a"
SRC_URI[dreamtwo.md5sum] = "77f3ba3815a507466c10153f8fd45ef5"
SRC_URI[dreamtwo.sha256sum] = "228eb66ea016697539b40a67b60a348f275e4b384e3f50118f3723bf6f121cbe"

require dreambox-dvb-modules.inc

RREPLACES_${PN} += "dreamframeinject"
RPROVIDES_${PN} += "dreamframeinject"
RCONFLICTS_${PN} += "dreamframeinject"

COMPATIBLE_MACHINE = "^(dreamone|dreamtwo)$"
