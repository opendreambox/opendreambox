require recovery.inc

SRCREV = "${@opendreambox_srcrev('44b55bfa99973ad362e58c4d21e5eef0e1f2db85', d)}"

inherit opendreambox-git

BRANCH = "master"

COMPATIBLE_MACHINE = "^(dm520|dm820|dm900|dm7080)$"
