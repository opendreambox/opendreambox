require recovery.inc

SRCREV = "${@opendreambox_srcrev('f6d9de6dc38272d83f19f63afe874e1cb58a8c61', d)}"
SRCREV_dm520 = "${@opendreambox_srcrev('fedaf4b8c61287c7b90977058ebd2f0f592685c9', d)}"
SRCREV_dm820 = "${@opendreambox_srcrev('b0f903a8442556c3c514af51eb074180e66c459e', d)}"
SRCREV_dm900 = "${@opendreambox_srcrev('60a9a8fd2e43323ed3cdf15a659592887c094b64', d)}"
SRCREV_dm7080 = "${@opendreambox_srcrev('8a3e07eedb016857db676991ead88498977287cb', d)}"

inherit opendreambox-git

BRANCH = "master"
BRANCH_dm520 = "dm520"
BRANCH_dm820 = "dm820"
BRANCH_dm900 = "dm900"
BRANCH_dm7080 = "dm7080"

COMPATIBLE_MACHINE = "^(dm520|dm820|dm900|dm7080)$"
