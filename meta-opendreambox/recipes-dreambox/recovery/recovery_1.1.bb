require recovery.inc

SRCREV = "${@opendreambox_srcrev('fbd0c5f9fd98dc2c5d394ddb41c43fca9a58989f', d)}"

inherit opendreambox-git

BRANCH = "master"

COMPATIBLE_MACHINE = "^(dm520|dm820|dm900|dm920|dm7080|dreamone)$"
