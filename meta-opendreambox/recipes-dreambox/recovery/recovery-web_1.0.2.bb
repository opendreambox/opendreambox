require recovery-web.inc

SRCREV = "${@opendreambox_srcrev('5d68fcde19886c1fdf4987ec18ceaa346a40c68a', d)}"
SRCREV_dm520 = "${@opendreambox_srcrev('d4bed10e5e569c6347db59144256437e9d793180', d)}"
SRCREV_dm820 = "${SRCREV_dm7080}"
SRCREV_dm900 = "${@opendreambox_srcrev('b7638bc3f83a61997fce4161c469780d1bec5bb2', d)}"
SRCREV_dm7080 = "${@opendreambox_srcrev('41a3e041e42025c2999a510af6abd4c5433ad05c', d)}"

inherit opendreambox-git

BRANCH = "master"
BRANCH_dm520 = "dm520"
BRANCH_dm820 = "${BRANCH_dm7080}"
BRANCH_dm900 = "dm900"
BRANCH_dm7080 = "dm7080"

COMPATIBLE_MACHINE = "^(dm520|dm820|dm900|dm7080)$"
