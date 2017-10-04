require recovery.inc

SRCREV = "${@opendreambox_srcrev('22639116d31bdfada7907281cd64735bf4174599', d)}"

inherit opendreambox-git

BRANCH = "master"

COMPATIBLE_MACHINE = "^(dm520|dm820|dm900|dm920|dm7080)$"
