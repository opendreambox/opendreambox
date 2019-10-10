SRC_URI[dreamone.md5sum] = "6e6bad2473611128a9bb3820ebdcdeb0"
SRC_URI[dreamone.sha256sum] = "5ab0e48878e791877603d9c06fc8bd5a5c475bcdd54d74f8aedfd776c952cd0f"

require dreambox-dvb-modules.inc

RREPLACES_${PN} += "dreamframeinject"
RPROVIDES_${PN} += "dreamframeinject"
RCONFLICTS_${PN} += "dreamframeinject"
