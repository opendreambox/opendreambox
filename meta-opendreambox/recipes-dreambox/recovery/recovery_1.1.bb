require recovery.inc

SRCREV = "${@opendreambox_srcrev('2b939fdc1df56fc351a4a09fdfea0244b96e213c', d)}"

inherit opendreambox-git

BRANCH = "master"

COMPATIBLE_MACHINE = "^(dm520|dm820|dm900|dm7080)$"
