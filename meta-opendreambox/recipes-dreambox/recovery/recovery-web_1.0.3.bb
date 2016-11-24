require recovery-web.inc

SRCREV = "${@opendreambox_srcrev('5d68fcde19886c1fdf4987ec18ceaa346a40c68a', d)}"
SRCREV_dm520 = "${@opendreambox_srcrev('c11696bbb42cba0e5274b33f94a08c9380d8a175', d)}"
SRCREV_dm820 = "${SRCREV_dm7080}"
SRCREV_dm900 = "${@opendreambox_srcrev('1010803b4a47b78b7c142bf9f44e295be10048a9', d)}"
SRCREV_dm7080 = "${@opendreambox_srcrev('a60df494e4d24d68eed90439df325c98eb275e01', d)}"

inherit opendreambox-git

BRANCH = "master"
BRANCH_dm520 = "dm520"
BRANCH_dm820 = "${BRANCH_dm7080}"
BRANCH_dm900 = "dm900"
BRANCH_dm7080 = "dm7080"

COMPATIBLE_MACHINE = "^(dm520|dm820|dm900|dm7080)$"
