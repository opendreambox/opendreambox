require recovery.inc

SRCREV = "${@opendreambox_srcrev('0e3a513e006e319bc24d8bf0e2d69ad1cc6a3a52', d)}"

inherit opendreambox-git

BRANCH = "master"

COMPATIBLE_MACHINE = "^(dm520|dm820|dm900|dm920|dm7080|dreamone)$"
