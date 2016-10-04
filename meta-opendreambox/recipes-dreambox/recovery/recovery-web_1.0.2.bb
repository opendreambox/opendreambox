require recovery-web.inc

SRCREV = "${@opendreambox_srcrev('5d68fcde19886c1fdf4987ec18ceaa346a40c68a', d)}"
SRCREV_dm520 = "${@opendreambox_srcrev('2b53d93ba21367e2e66bf6030e61cd372d9f8c07', d)}"
SRCREV_dm820 = "${SRCREV_dm7080}"
SRCREV_dm900 = "${@opendreambox_srcrev('b2e5262188d07c2cbc2b70a4c9b909e222025bdc', d)}"
SRCREV_dm7080 = "${@opendreambox_srcrev('9746fff85c7ad625784ec04517d9cbe3437a11f5', d)}"

inherit opendreambox-git

BRANCH = "master"
BRANCH_dm520 = "dm520"
BRANCH_dm820 = "${BRANCH_dm7080}"
BRANCH_dm900 = "dm900"
BRANCH_dm7080 = "dm7080"

COMPATIBLE_MACHINE = "^(dm520|dm820|dm900|dm7080)$"
