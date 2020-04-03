require recovery.inc

SRCREV = "${@opendreambox_srcrev('39f463068a80c0e886af96d9eb3771cd81260a70', d)}"

inherit opendreambox-git

BRANCH = "master"

COMPATIBLE_MACHINE = "^(dm520|dm820|dm900|dm920|dm7080|dreamone)$"
